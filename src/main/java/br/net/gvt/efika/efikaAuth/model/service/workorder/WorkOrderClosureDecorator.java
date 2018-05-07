/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaAuth.model.service.workorder;

import br.net.gvt.efika.efikaAuth.model.entity.workorder.WorkOrderClosure;

/**
 *
 * @author G0041775
 */
public class WorkOrderClosureDecorator {

    /**
     * merges c2 in c1, returns c1
     *
     * @param c1
     * @param c2
     * @return
     */
    public static WorkOrderClosure merge(WorkOrderClosure c1, WorkOrderClosure c2) {
        c1.setAtendente(c2.getAtendente());
        c1.setDataSolicitacao(c2.getDataSolicitacao());
        c1.setEnc1(c2.getEnc1());
        c1.setEnc2(c2.getEnc2());
        c1.setEnc3(c2.getEnc3());
        c1.setSolicitante(c2.getSolicitante());
        c1.setSs(c2.getSs());
        c1.setStatus(c2.getStatus());
        return c1;
    }
    
}
