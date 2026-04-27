package github.com.ifyosakwe.clippy.model;

import github.com.ifyosakwe.clippy.entity.Role;

public record CreateUserCmd(
        String email,
        String password,
        String name,
        Role role) {
}
