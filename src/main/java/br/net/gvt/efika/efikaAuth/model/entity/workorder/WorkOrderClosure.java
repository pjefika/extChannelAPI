/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaAuth.model.entity.workorder;

import br.net.gvt.efika.efikaAuth.model.enums.CodEncerramento;
import br.net.gvt.efika.efikaAuth.model.enums.StatusClosure;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;

/**
 *
 * @author G0041775
 */
@Entity("closure")
public class WorkOrderClosure {

    @Indexed(options = @IndexOptions(unique = true))
    private String ss;

    @Id
    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;

    private String solicitante, atendente;

    private Date dataSolicitacao, dataEncerramento;

    private CodEncerramento enc1, enc2, enc3;

    private StatusClosure status;

    public WorkOrderClosure() {
    }

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public CodEncerramento getEnc1() {
        return enc1;
    }

    public void setEnc1(CodEncerramento enc1) {
        this.enc1 = enc1;
    }

    public CodEncerramento getEnc2() {
        return enc2;
    }

    public void setEnc2(CodEncerramento enc2) {
        this.enc2 = enc2;
    }

    public CodEncerramento getEnc3() {
        return enc3;
    }

    public void setEnc3(CodEncerramento enc3) {
        this.enc3 = enc3;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public Date getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public Date getDataEncerramento() {
        return dataEncerramento;
    }

    public void setDataEncerramento(Date dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }

    public StatusClosure getStatus() {
        return status;
    }

    public void setStatus(StatusClosure status) {
        this.status = status;
    }

}
