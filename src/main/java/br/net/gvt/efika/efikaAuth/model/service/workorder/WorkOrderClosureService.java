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
public interface WorkOrderClosureService {

    public WorkOrderClosure getWorkerOrderClosure(String ss) throws Exception;

    public WorkOrderClosure insertWorkOrderClosure(WorkOrderClosure closure) throws Exception;

    public WorkOrderClosure endWorkOrderClosure(WorkOrderClosure closure) throws Exception;

}
