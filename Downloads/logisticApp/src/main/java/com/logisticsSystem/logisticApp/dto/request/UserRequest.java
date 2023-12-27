package com.logisticsSystem.logisticApp.dto.request;



import com.logisticsSystem.logisticApp.data.model.AppUserType;
import lombok.Data;

@Data

public class UserRequest {
    private String username;
    private String email;
    private String password;
    private AppUserType appUserType;

}