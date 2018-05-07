/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.efikaAuth.model.service.workorder;

import br.net.gvt.efika.efikaAuth.model.entity.workorder.WorkOrderClosure;
import br.net.gvt.efika.efikaAuth.model.enums.CodEncerramento;
import br.net.gvt.efika.efikaAuth.model.enums.StatusClosure;
import br.net.gvt.efika.util.json.JacksonMapper;
import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G0041775
 */
public class WorkOrderClosureServiceImplIT {
    
    public WorkOrderClosureServiceImplIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getWorkerOrderClosure method, of class
     * WorkOrderClosureServiceImpl.
     */
    @Test
    public void testGetWorkerOrderClosure() throws Exception {
        System.out.println("getWorkerOrderClosure");
        String ss = "8-123456789";
        WorkOrderClosureServiceImpl instance = new WorkOrderClosureServiceImpl();
        
        WorkOrderClosure result = instance.getWorkerOrderClosure(ss);
        System.out.println(new JacksonMapper(WorkOrderClosure.class).serialize(result));
    }

    /**
     * Test of insertWorkOrderClosure method, of class
     * WorkOrderClosureServiceImpl.
     */
    @Test
    public void testInsertWorkOrderClosure() throws Exception {
        System.out.println("insertWorkOrderClosure");
        WorkOrderClosure closure = new WorkOrderClosure();
        closure.setAtendente("G0041775");
        closure.setDataSolicitacao(Calendar.getInstance().getTime());
        closure.setEnc1(CodEncerramento.ENCERRAMENTO1);
        closure.setEnc2(CodEncerramento.ENCERRAMENTO1);
        closure.setEnc3(CodEncerramento.ENCERRAMENTO1);
        closure.setSolicitante("G0041775");
        closure.setSs("8-123456789");
        WorkOrderClosureServiceImpl instance = new WorkOrderClosureServiceImpl();
   
        WorkOrderClosure result = instance.insertWorkOrderClosure(closure);
        System.out.println(new JacksonMapper(WorkOrderClosure.class).serialize(result));
    }

    /**
     * Test of endWorkOrderClosure method, of class WorkOrderClosureServiceImpl.
     */
    @Test
    public void testEndWorkOrderClosure() throws Exception {
        System.out.println("endWorkOrderClosure");
        
        WorkOrderClosureServiceImpl instance = new WorkOrderClosureServiceImpl();
        WorkOrderClosure closure = instance.getWorkerOrderClosure("8-123456789");
        closure.setStatus(StatusClosure.NEGADO);
        WorkOrderClosure result = instance.endWorkOrderClosure(closure);
        System.out.println(new JacksonMapper(WorkOrderClosure.class).serialize(result));
    }
    
}
