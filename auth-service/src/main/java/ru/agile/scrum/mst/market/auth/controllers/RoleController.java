package ru.agile.scrum.mst.market.auth.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.agile.scrum.mst.market.api.ListResponse;
import ru.agile.scrum.mst.market.auth.services.RoleService;

@RestController
@RequestMapping("/api/v1/roles")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PreAuthorize("hasAuthority('ROLE_SUPERADMIN')")
    @GetMapping
    public ListResponse<String> getAllUserRoles() {
        return new ListResponse<>(roleService.getAllRolesStr());
    }

    @PreAuthorize("hasAuthority('ROLE_USER')")
    @GetMapping("/titles")
    public ListResponse<String> getAllRoleTitles() {
        return new ListResponse<>(roleService.getAllRoleTitles());
    }
}
