package com.example.demo.controllers;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.adapters.RefreshableKeycloakSecurityContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public Set<String> getUserRoles(KeycloakPrincipal<RefreshableKeycloakSecurityContext> principal) {
        return principal.getKeycloakSecurityContext().getToken().getRealmAccess().getRoles();
    }

}
