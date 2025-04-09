package com.example.ourLog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
  private Long userId;
  private String email;
  private String password;
  private String nickname;
  private String name;
  private String mobile;
  private boolean fromSocial;
  @Builder.Default
  private Set<String> roleSet = new HashSet<>();
  private LocalDateTime regDate;
  private LocalDateTime modDate;
}