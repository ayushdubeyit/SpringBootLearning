package com.spring_boot.json_api.model;

public class StatusResponse {

    private String status;
    private String service;

    public StatusResponse(String status, String service) {
        this.status = status;
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public String getService() {
        return service;
    }
}
