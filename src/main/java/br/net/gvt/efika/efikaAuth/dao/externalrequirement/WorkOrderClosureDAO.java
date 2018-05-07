/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaAuth.dao.externalrequirement;

import br.net.gvt.efika.efikaAuth.model.entity.workorder.WorkOrderClosure;
import br.net.gvt.efika.mongo.dao.AbstractMongoDAO;
import br.net.gvt.efika.mongo.dao.MongoEndpointEnum;
import org.mongodb.morphia.query.UpdateOperations;

/**
 *
 * @author G0041775
 */
public class WorkOrderClosureDAO extends AbstractMongoDAO<WorkOrderClosure> {

    public WorkOrderClosureDAO() {
        super(MongoEndpointEnum.MONGO.getIp(), "extChannel", WorkOrderClosure.class);
    }

    public WorkOrderClosure getBySs(String ss) throws Exception {
        return getDatastore().createQuery(WorkOrderClosure.class).field("ss").equalIgnoreCase(ss).get();
    }

    public WorkOrderClosure update(WorkOrderClosure c, UpdateOperations<WorkOrderClosure> opers) throws Exception {
        getDatastore().update(c, opers);
        return c;
    }

}
