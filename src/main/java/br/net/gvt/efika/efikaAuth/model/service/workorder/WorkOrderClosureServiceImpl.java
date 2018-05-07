/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaAuth.model.service.workorder;

import br.net.gvt.efika.efikaAuth.dao.externalrequirement.WorkOrderClosureDAO;
import br.net.gvt.efika.efikaAuth.model.entity.workorder.WorkOrderClosure;
import br.net.gvt.efika.efikaAuth.model.enums.StatusClosure;
import java.util.Calendar;

public class WorkOrderClosureServiceImpl implements WorkOrderClosureService {

    private WorkOrderClosureDAO dao = new WorkOrderClosureDAO();

    @Override
    public WorkOrderClosure getWorkerOrderClosure(String ss) throws Exception {
        return dao.getBySs(ss);
    }

    @Override
    public WorkOrderClosure insertWorkOrderClosure(WorkOrderClosure closure) throws Exception {
        closure.setStatus(StatusClosure.PENDENTE);
        closure.setDataSolicitacao(Calendar.getInstance().getTime());
        dao.save(closure);
        return getWorkerOrderClosure(closure.getSs());
    }

    @Override
    public WorkOrderClosure endWorkOrderClosure(WorkOrderClosure closure) throws Exception {
        return dao.update(closure, dao.createUpdateOperations()
                .set("status", closure.getStatus())
                .set("dataEncerramento", Calendar.getInstance().getTime()));
    }

}
