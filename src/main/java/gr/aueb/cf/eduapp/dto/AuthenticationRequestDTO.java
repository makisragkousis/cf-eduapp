package gr.aueb.cf.eduapp.dto;

import jakarta.validation.constraints.NotNull;

public record AuthenticationRequestDTO(String username, @NotNull String password) {
}
