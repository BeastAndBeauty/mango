package com.paopao.mango.admin.security;

import com.paopao.mango.admin.model.SysUser;
import com.paopao.mango.admin.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 用户登录认证信息查询
 * Create by paopao on 2019-11-18 23:03
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserService.findByName(s);
        if (user == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        //用户权限列表，根据用户拥有的权限标识与如@PreAuthoriza("hasAuthority('sys:menu:view')") 标注的接口对比，决定是否可以调用接口
        Set<String> permissions=sysUserService.findPermissions(user.getName());
        List<GrantedAuthority> grantedAuthorities=permissions.stream().map(GrantedAuthorityImpl::new).collect(Collectors.toList());
        return new JwtUserDetails(user.getName(),user.getPassword(),user.getSalt(),grantedAuthorities);
    }
}
