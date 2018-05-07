/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaAuth.model.enums;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 *
 * @author G0041775
 */
public enum CodEncerramento {

    ENCERRAMENTO1("Nome do encerramento 1"),
    ENCERRAMENTO2("Nome do encerramento 2"),
    ENCERRAMENTO3("Nome do encerramento 3");

    private String value;

    CodEncerramento(String value) {
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }
}
