package uvsoftgroup.uvsoftgroupurgtnwebapp.service;

import java.util.List;

import org.springframework.stereotype.Service;


import uvsoftgroup.uvsoftgroupurgtnwebapp.model.UserRole;

@Service
public interface UserRoleService {
	
	public void saveUserRole(UserRole userRole) throws Exception;
	public List<UserRole> findAllUserRole();
	public UserRole findUserRole(Long urId);
	public UserRole deleteUserRole(Long urId);
	public void updateUserRole(Long urId, UserRole userRole);

}
