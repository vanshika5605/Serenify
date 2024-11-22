import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass2 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.Class<?> wildcardClass2 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass5 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        boolean boolean5 = clientNotification0.equals((java.lang.Object) 100.0d);
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        clientNotification0.setEventType("hi!");
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        clientNotification0.setRequestId("");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass3 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.Class<?> wildcardClass5 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "hi!");
        boolean boolean6 = clientNotification4.equals((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass15 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        java.lang.String str10 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getEventType();
        java.lang.String str6 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "hi!");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        clientNotification3.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventType();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass11 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        java.lang.String str12 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("hi!");
        java.lang.String str7 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventTime();
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 100.0f);
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("hi!");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Object obj7 = null;
        boolean boolean8 = clientNotification4.equals(obj7);
        java.lang.String str9 = clientNotification4.getPatientId();
        java.lang.Class<?> wildcardClass10 = clientNotification4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification9.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        boolean boolean12 = clientNotification0.equals((java.lang.Object) clientNotification9);
        java.lang.Class<?> wildcardClass13 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass7 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventTime();
        java.lang.String str6 = clientNotification4.toString();
        java.lang.Class<?> wildcardClass7 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str6, "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.String str8 = clientNotification0.getEventType();
        java.lang.String str9 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str13 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventType("hi!");
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getRequestId();
        java.lang.String str10 = clientNotification0.getPatientId();
        java.lang.Class<?> wildcardClass11 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("hi!");
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "hi!", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getEventType();
        java.lang.String str9 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        java.lang.String str7 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification14 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str15 = clientNotification14.getPatientId();
        java.lang.String str16 = clientNotification14.getPatientId();
        clientNotification14.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification14.setEventType("");
        boolean boolean21 = clientNotification0.equals((java.lang.Object) "");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("");
        java.lang.String str8 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass9 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setRequestId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getEventType();
        java.lang.String str14 = clientNotification12.getPatientId();
        boolean boolean16 = clientNotification12.equals((java.lang.Object) '4');
        java.lang.String str17 = clientNotification12.toString();
        boolean boolean18 = clientNotification9.equals((java.lang.Object) str17);
        java.lang.String str19 = clientNotification9.getPatientId();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.String str21 = clientNotification4.getEventType();
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str21, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        java.lang.String str11 = clientNotification6.getPatientId();
        boolean boolean12 = clientNotification0.equals((java.lang.Object) str11);
        java.lang.Class<?> wildcardClass13 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass7 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.toString();
        java.lang.Class<?> wildcardClass9 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str8, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str7 = clientNotification4.getEventTime();
        java.lang.String str8 = clientNotification4.getPatientId();
        java.lang.String str9 = clientNotification4.toString();
        java.lang.String str10 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str9, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.Class<?> wildcardClass17 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str16 = clientNotification8.toString();
        clientNotification8.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification21 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str22 = clientNotification21.getPatientId();
        java.lang.String str23 = clientNotification21.getPatientId();
        clientNotification21.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean26 = clientNotification8.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str27 = clientNotification8.toString();
        boolean boolean28 = clientNotification0.equals((java.lang.Object) str27);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str16, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str27, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("");
        java.lang.String str9 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.toString();
        java.lang.String str12 = clientNotification9.toString();
        java.lang.String str13 = clientNotification9.getPatientId();
        clientNotification9.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) clientNotification9);
        java.lang.String str19 = clientNotification9.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getRequestId();
        clientNotification4.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str8 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 100.0f);
        java.lang.Object obj9 = null;
        boolean boolean10 = clientNotification0.equals(obj9);
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 100.0f);
        java.lang.String str9 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "hi!", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        clientNotification7.setEventType("");
        java.lang.String str11 = clientNotification7.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getRequestId();
        java.lang.String str14 = clientNotification12.getRequestId();
        clientNotification12.setEventType("");
        java.lang.String str17 = clientNotification12.getEventTime();
        boolean boolean18 = clientNotification7.equals((java.lang.Object) str17);
        clientNotification7.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean21 = clientNotification4.equals((java.lang.Object) clientNotification7);
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification4.getRequestId();
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        clientNotification7.setEventType("");
        java.lang.String str11 = clientNotification7.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getRequestId();
        java.lang.String str14 = clientNotification12.getRequestId();
        clientNotification12.setEventType("");
        java.lang.String str17 = clientNotification12.getEventTime();
        boolean boolean18 = clientNotification7.equals((java.lang.Object) str17);
        clientNotification7.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean21 = clientNotification4.equals((java.lang.Object) clientNotification7);
        clientNotification7.setEventType("");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str9 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("");
        java.lang.String str8 = clientNotification0.getRequestId();
        java.lang.String str9 = clientNotification0.getEventType();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass9 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getEventType();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification10 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str11 = clientNotification10.getRequestId();
        clientNotification10.setEventType("");
        java.lang.String str14 = clientNotification10.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification15 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str16 = clientNotification15.getRequestId();
        java.lang.String str17 = clientNotification15.getRequestId();
        clientNotification15.setEventType("");
        java.lang.String str20 = clientNotification15.getEventTime();
        boolean boolean21 = clientNotification10.equals((java.lang.Object) str20);
        clientNotification10.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification10.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification10.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        boolean boolean28 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str14, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        java.lang.String str12 = clientNotification0.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification17 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "hi!");
        java.lang.Class<?> wildcardClass18 = clientNotification17.getClass();
        boolean boolean19 = clientNotification0.equals((java.lang.Object) clientNotification17);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventType();
        java.lang.String str6 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str19, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.getEventTime();
        java.lang.String str9 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass10 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str8 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventType();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str5 = clientNotification4.getRequestId();
        clientNotification4.setEventType("");
        clientNotification4.setRequestId("");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str12 = clientNotification4.toString();
        clientNotification4.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean17 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str18 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str12, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str6 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean9 = clientNotification0.equals((java.lang.Object) false);
        java.lang.String str10 = clientNotification0.getEventType();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification15 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        boolean boolean16 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str5 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.Class<?> wildcardClass19 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str19 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass20 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "hi!");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        java.lang.String str8 = clientNotification5.getRequestId();
        clientNotification5.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str11 = clientNotification5.getPatientId();
        clientNotification5.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification5.getPatientId();
        boolean boolean15 = clientNotification4.equals((java.lang.Object) str14);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getEventTime();
        java.lang.String str9 = clientNotification0.getEventTime();
        java.lang.String str10 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.String str8 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        boolean boolean14 = clientNotification0.equals((java.lang.Object) clientNotification13);
        java.lang.String str15 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification9.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        boolean boolean12 = clientNotification0.equals((java.lang.Object) clientNotification9);
        java.lang.Class<?> wildcardClass13 = clientNotification9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.getEventType();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        java.lang.String str9 = clientNotification7.getRequestId();
        java.lang.String str10 = clientNotification7.getRequestId();
        java.lang.String str11 = clientNotification7.getPatientId();
        java.lang.String str12 = clientNotification7.getEventTime();
        boolean boolean13 = clientNotification0.equals((java.lang.Object) str12);
        java.lang.Class<?> wildcardClass14 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        java.lang.String str7 = clientNotification0.getEventTime();
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getEventType();
        clientNotification0.setPatientId("");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "hi!");
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventTime("");
        java.lang.Class<?> wildcardClass19 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        java.lang.String str5 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str4 = clientNotification3.getEventType();
        java.lang.String str5 = clientNotification3.getPatientId();
        boolean boolean7 = clientNotification3.equals((java.lang.Object) '4');
        java.lang.String str8 = clientNotification3.toString();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) str8);
        java.lang.String str10 = clientNotification0.getPatientId();
        java.lang.String str11 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getRequestId();
        java.lang.String str6 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventTime();
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification4.getEventTime();
        clientNotification4.setEventTime("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setEventTime("hi!");
        java.lang.String str8 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        boolean boolean5 = clientNotification0.equals((java.lang.Object) 100.0d);
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        java.lang.String str5 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "");
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getPatientId();
        java.lang.String str12 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))", "");
        java.lang.String str5 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)" + "'", str5, "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean9 = clientNotification0.equals((java.lang.Object) false);
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getPatientId();
        java.lang.String str3 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        java.lang.String str10 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))" + "'", str10, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str8 = clientNotification0.getEventType();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass11 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean9 = clientNotification0.equals((java.lang.Object) false);
        clientNotification0.setEventTime("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.toString();
        java.lang.String str7 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        java.lang.String str10 = clientNotification8.getRequestId();
        java.lang.String str11 = clientNotification8.getRequestId();
        java.lang.String str12 = clientNotification8.getEventType();
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean15 = clientNotification0.equals((java.lang.Object) clientNotification8);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getEventType();
        java.lang.String str14 = clientNotification12.getPatientId();
        boolean boolean16 = clientNotification12.equals((java.lang.Object) '4');
        java.lang.String str17 = clientNotification12.toString();
        boolean boolean18 = clientNotification9.equals((java.lang.Object) str17);
        java.lang.String str19 = clientNotification9.getPatientId();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.String str21 = clientNotification4.getEventType();
        clientNotification4.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str21, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str13 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)" + "'", str13, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass22 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getPatientId();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) '4');
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getPatientId();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getRequestId();
        java.lang.String str5 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getEventType();
        java.lang.String str9 = clientNotification4.getEventTime();
        java.lang.String str10 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification17 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str18 = clientNotification17.getRequestId();
        java.lang.String str19 = clientNotification17.getRequestId();
        java.lang.String str20 = clientNotification17.getRequestId();
        clientNotification17.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str23 = clientNotification17.getEventType();
        boolean boolean25 = clientNotification17.equals((java.lang.Object) 100.0f);
        boolean boolean26 = clientNotification0.equals((java.lang.Object) clientNotification17);
        java.lang.String str27 = clientNotification17.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str23, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("");
        java.lang.String str8 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getRequestId();
        java.lang.String str10 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "hi!");
        java.lang.String str5 = clientNotification4.getEventTime();
        java.lang.Class<?> wildcardClass6 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.Class<?> wildcardClass14 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getPatientId();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) '4');
        java.lang.String str5 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventType();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str5 = clientNotification4.getRequestId();
        clientNotification4.setEventType("");
        clientNotification4.setRequestId("");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str12 = clientNotification4.toString();
        clientNotification4.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean17 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str12, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification9.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        boolean boolean12 = clientNotification0.equals((java.lang.Object) clientNotification9);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getRequestId();
        clientNotification13.setEventType("");
        java.lang.String str17 = clientNotification13.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification18 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str19 = clientNotification18.getRequestId();
        java.lang.String str20 = clientNotification18.getRequestId();
        clientNotification18.setEventType("");
        java.lang.String str23 = clientNotification18.getEventTime();
        boolean boolean24 = clientNotification13.equals((java.lang.Object) str23);
        clientNotification13.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification13.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        boolean boolean31 = clientNotification9.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        java.lang.Class<?> wildcardClass32 = clientNotification9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        java.lang.String str11 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        clientNotification3.setEventType("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str10 = clientNotification0.getEventTime();
        clientNotification0.setEventType("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass9 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "hi!");
        java.lang.String str5 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification3.setPatientId("");
        java.lang.String str9 = clientNotification3.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)", "hi!");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "hi!");
        java.lang.String str5 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=hi!)" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=hi!)");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        java.lang.String str12 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        java.lang.String str9 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str12 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventType();
        clientNotification4.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventType("hi!");
        java.lang.String str8 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification4.setEventType("hi!");
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        java.lang.String str7 = clientNotification0.getEventTime();
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
        java.lang.String str12 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str22 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str22, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getEventTime();
        java.lang.String str3 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 100.0f);
        java.lang.String str9 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass10 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass3 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("");
        java.lang.String str9 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        clientNotification7.setEventType("");
        java.lang.String str11 = clientNotification7.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getRequestId();
        java.lang.String str14 = clientNotification12.getRequestId();
        clientNotification12.setEventType("");
        java.lang.String str17 = clientNotification12.getEventTime();
        boolean boolean18 = clientNotification7.equals((java.lang.Object) str17);
        clientNotification7.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean21 = clientNotification4.equals((java.lang.Object) clientNotification7);
        clientNotification4.setPatientId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass24 = clientNotification4.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str7 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass11 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "hi!");
        java.lang.String str5 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.getEventType();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.getEventTime();
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str10 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        clientNotification0.setPatientId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setRequestId("hi!");
        java.lang.String str9 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str12 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "hi!");
        java.lang.String str5 = clientNotification4.getPatientId();
        java.lang.String str6 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str6, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getEventType();
        java.lang.String str14 = clientNotification12.getPatientId();
        boolean boolean16 = clientNotification12.equals((java.lang.Object) '4');
        java.lang.String str17 = clientNotification12.toString();
        boolean boolean18 = clientNotification9.equals((java.lang.Object) str17);
        java.lang.String str19 = clientNotification9.getPatientId();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.String str21 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str21, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.String str8 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getPatientId();
        java.lang.String str10 = clientNotification8.getPatientId();
        java.lang.String str11 = clientNotification8.getEventType();
        clientNotification8.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        boolean boolean14 = clientNotification0.equals((java.lang.Object) clientNotification8);
        java.lang.String str15 = clientNotification0.toString();
        java.lang.String str16 = clientNotification0.getPatientId();
        java.lang.String str17 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str15, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str16, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Object obj7 = null;
        boolean boolean8 = clientNotification4.equals(obj7);
        java.lang.String str9 = clientNotification4.getPatientId();
        java.lang.String str10 = clientNotification4.getPatientId();
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getRequestId();
        java.lang.String str15 = clientNotification13.getRequestId();
        java.lang.String str16 = clientNotification13.getRequestId();
        java.lang.String str17 = clientNotification13.getPatientId();
        java.lang.String str18 = clientNotification13.getEventTime();
        java.lang.String str19 = clientNotification13.toString();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) str19);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str19, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getPatientId();
        java.lang.String str10 = clientNotification0.getPatientId();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        clientNotification0.setEventType("hi!");
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str9 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)" + "'", str9, "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str5 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str10 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str10, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification4.getPatientId();
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        clientNotification4.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str7, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "hi!");
        java.lang.String str5 = clientNotification4.getPatientId();
        java.lang.String str6 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getEventTime();
        java.lang.String str9 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        java.lang.String str8 = clientNotification5.getRequestId();
        java.lang.String str9 = clientNotification5.getEventType();
        java.lang.String str10 = clientNotification5.getRequestId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "hi!", "hi!", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification4.setRequestId("");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.String str8 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        boolean boolean14 = clientNotification0.equals((java.lang.Object) clientNotification13);
        java.lang.String str15 = clientNotification13.getEventTime();
        java.lang.Class<?> wildcardClass16 = clientNotification13.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification17 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str18 = clientNotification17.getRequestId();
        java.lang.String str19 = clientNotification17.getRequestId();
        java.lang.String str20 = clientNotification17.getRequestId();
        clientNotification17.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str23 = clientNotification17.getEventType();
        boolean boolean25 = clientNotification17.equals((java.lang.Object) 100.0f);
        boolean boolean26 = clientNotification0.equals((java.lang.Object) clientNotification17);
        clientNotification17.setEventTime("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str23, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getRequestId();
        java.lang.String str10 = clientNotification0.getPatientId();
        java.lang.String str11 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setRequestId("hi!");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification15 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str16 = clientNotification15.getRequestId();
        clientNotification15.setEventType("");
        boolean boolean20 = clientNotification15.equals((java.lang.Object) 100.0d);
        boolean boolean21 = clientNotification0.equals((java.lang.Object) boolean20);
        java.lang.String str22 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str22, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getEventType();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        clientNotification6.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str12 = clientNotification6.getPatientId();
        clientNotification6.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification6.setPatientId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        boolean boolean17 = clientNotification0.equals((java.lang.Object) clientNotification6);
        java.lang.Class<?> wildcardClass18 = clientNotification6.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.toString();
        java.lang.String str20 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)");
        java.lang.String str23 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str20, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str23, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getEventType();
        java.lang.String str14 = clientNotification12.getPatientId();
        boolean boolean16 = clientNotification12.equals((java.lang.Object) '4');
        java.lang.String str17 = clientNotification12.toString();
        boolean boolean18 = clientNotification9.equals((java.lang.Object) str17);
        java.lang.String str19 = clientNotification9.getPatientId();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.String str21 = clientNotification4.getEventType();
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str24 = clientNotification4.getRequestId();
        java.lang.Class<?> wildcardClass25 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str21, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str24, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getPatientId();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        java.lang.String str9 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass7 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        clientNotification8.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification24 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str25 = clientNotification24.getPatientId();
        java.lang.String str26 = clientNotification24.toString();
        java.lang.String str27 = clientNotification24.toString();
        java.lang.String str28 = clientNotification24.getRequestId();
        java.lang.Class<?> wildcardClass29 = clientNotification24.getClass();
        boolean boolean30 = clientNotification8.equals((java.lang.Object) clientNotification24);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str26, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str27, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification11 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification11.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification11.getRequestId();
        java.lang.String str15 = clientNotification11.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification16 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str17 = clientNotification16.getPatientId();
        java.lang.String str18 = clientNotification16.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification19 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str20 = clientNotification19.getEventType();
        java.lang.String str21 = clientNotification19.getPatientId();
        boolean boolean23 = clientNotification19.equals((java.lang.Object) '4');
        java.lang.String str24 = clientNotification19.toString();
        boolean boolean25 = clientNotification16.equals((java.lang.Object) str24);
        java.lang.String str26 = clientNotification16.getPatientId();
        boolean boolean27 = clientNotification11.equals((java.lang.Object) clientNotification16);
        clientNotification11.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        boolean boolean30 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str14, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str15, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str24, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.toString();
        java.lang.String str12 = clientNotification9.toString();
        java.lang.String str13 = clientNotification9.getPatientId();
        clientNotification9.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) clientNotification9);
        java.lang.Class<?> wildcardClass19 = clientNotification9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getPatientId();
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str16 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=null)" + "'", str16, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=null)");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification3.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        clientNotification0.setRequestId("hi!");
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getEventTime();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getPatientId();
        java.lang.String str8 = clientNotification6.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean10 = clientNotification6.equals((java.lang.Object) clientNotification9);
        java.lang.String str11 = clientNotification9.getRequestId();
        clientNotification9.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        boolean boolean14 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass15 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification4.getRequestId();
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass7 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.toString();
        java.lang.String str12 = clientNotification9.toString();
        java.lang.String str13 = clientNotification9.getPatientId();
        clientNotification9.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) clientNotification9);
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str21 = clientNotification9.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str21, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!");
        java.lang.String str5 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventType();
        java.lang.String str4 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.toString();
        java.lang.String str15 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str14, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str15, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification3.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification3.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        java.lang.String str11 = clientNotification6.getPatientId();
        boolean boolean12 = clientNotification0.equals((java.lang.Object) str11);
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str15 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)" + "'", str15, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification0.setPatientId("");
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        clientNotification7.setEventType("");
        java.lang.String str11 = clientNotification7.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getRequestId();
        java.lang.String str14 = clientNotification12.getRequestId();
        clientNotification12.setEventType("");
        java.lang.String str17 = clientNotification12.getEventTime();
        boolean boolean18 = clientNotification7.equals((java.lang.Object) str17);
        clientNotification7.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean21 = clientNotification4.equals((java.lang.Object) clientNotification7);
        java.lang.String str22 = clientNotification4.getPatientId();
        java.lang.String str23 = clientNotification4.getPatientId();
        java.lang.String str24 = clientNotification4.toString();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str24, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))" + "'", str5, "ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str19 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification20 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str21 = clientNotification20.getRequestId();
        clientNotification20.setRequestId("");
        java.lang.String str24 = clientNotification20.toString();
        java.lang.String str25 = clientNotification20.getRequestId();
        java.lang.String str26 = clientNotification20.getRequestId();
        java.lang.String str27 = clientNotification20.getEventType();
        java.lang.String str28 = clientNotification20.toString();
        boolean boolean29 = clientNotification0.equals((java.lang.Object) str28);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str24, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str28, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getEventType();
        java.lang.String str14 = clientNotification12.getPatientId();
        boolean boolean16 = clientNotification12.equals((java.lang.Object) '4');
        java.lang.String str17 = clientNotification12.toString();
        boolean boolean18 = clientNotification9.equals((java.lang.Object) str17);
        java.lang.String str19 = clientNotification9.getPatientId();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.String str21 = clientNotification4.getEventType();
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str24 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str21, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str24, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        java.lang.Class<?> wildcardClass18 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        clientNotification3.setPatientId("ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=hi!)");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        java.lang.String str7 = clientNotification0.getEventTime();
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.toString();
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str8, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.toString();
        java.lang.String str12 = clientNotification9.toString();
        java.lang.String str13 = clientNotification9.getPatientId();
        clientNotification9.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) clientNotification9);
        clientNotification9.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification9.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        clientNotification0.setPatientId("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "hi!", "hi!", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification4.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.Class<?> wildcardClass9 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass11 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        java.lang.String str10 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str10, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.Class<?> wildcardClass4 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str22 = clientNotification0.getEventTime();
        java.lang.String str23 = clientNotification0.getRequestId();
        java.lang.String str24 = clientNotification0.getEventTime();
        java.lang.String str25 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str22, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str24, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str25, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean17 = clientNotification8.equals((java.lang.Object) false);
        java.lang.String str18 = clientNotification8.getEventType();
        boolean boolean19 = clientNotification0.equals((java.lang.Object) clientNotification8);
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str22 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventType("hi!");
        java.lang.String str8 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.Class<?> wildcardClass11 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean8 = clientNotification4.equals((java.lang.Object) "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)");
        java.lang.String str9 = clientNotification4.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str10 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str6 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        java.lang.String str5 = clientNotification4.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification10 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean11 = clientNotification4.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Object obj7 = null;
        boolean boolean8 = clientNotification4.equals(obj7);
        java.lang.String str9 = clientNotification4.toString();
        clientNotification4.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str9, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))", "hi!");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))");
        java.lang.String str12 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass13 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getRequestId();
        clientNotification9.setEventType("");
        java.lang.String str13 = clientNotification9.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification14 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str15 = clientNotification14.getRequestId();
        java.lang.String str16 = clientNotification14.getRequestId();
        clientNotification14.setEventType("");
        java.lang.String str19 = clientNotification14.getEventTime();
        boolean boolean20 = clientNotification9.equals((java.lang.Object) str19);
        clientNotification9.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str23 = clientNotification9.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification24 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str25 = clientNotification24.getRequestId();
        clientNotification24.setRequestId("");
        boolean boolean28 = clientNotification9.equals((java.lang.Object) clientNotification24);
        boolean boolean29 = clientNotification0.equals((java.lang.Object) clientNotification24);
        java.lang.String str30 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str13, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))" + "'", str23, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventTime("");
        java.lang.String str19 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str6 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str6, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass10 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str17 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        java.lang.String str11 = clientNotification6.getPatientId();
        boolean boolean12 = clientNotification0.equals((java.lang.Object) str11);
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str15 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str9 = clientNotification0.getEventType();
        java.lang.String str10 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str10, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getPatientId();
        clientNotification4.setRequestId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        clientNotification0.setEventType("hi!");
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getEventTime();
        clientNotification4.setRequestId("ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        boolean boolean5 = clientNotification0.equals((java.lang.Object) 100.0d);
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.toString();
        java.lang.String str12 = clientNotification9.toString();
        java.lang.String str13 = clientNotification9.getPatientId();
        clientNotification9.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) clientNotification9);
        clientNotification9.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification9.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventTime();
        java.lang.String str6 = clientNotification4.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification11 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "");
        boolean boolean12 = clientNotification4.equals((java.lang.Object) "hi!");
        java.lang.Class<?> wildcardClass13 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str6, "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setEventTime("");
        java.lang.String str14 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str14, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getEventTime();
        clientNotification4.setRequestId("");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str16 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        java.lang.String str12 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass15 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)", "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))", "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=null)");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification15 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str16 = clientNotification15.getRequestId();
        clientNotification15.setRequestId("");
        boolean boolean19 = clientNotification0.equals((java.lang.Object) clientNotification15);
        clientNotification15.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))" + "'", str14, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str9 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        clientNotification8.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str24 = clientNotification8.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=hi!)" + "'", str24, "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=hi!)");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str4 = clientNotification3.getEventType();
        java.lang.String str5 = clientNotification3.getPatientId();
        boolean boolean7 = clientNotification3.equals((java.lang.Object) '4');
        java.lang.String str8 = clientNotification3.toString();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) str8);
        java.lang.Class<?> wildcardClass10 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("hi!");
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 10L);
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.toString();
        java.lang.String str12 = clientNotification9.toString();
        java.lang.String str13 = clientNotification9.getPatientId();
        clientNotification9.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) clientNotification9);
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.Class<?> wildcardClass21 = clientNotification9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getEventTime();
        java.lang.String str9 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass14 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setEventTime("hi!");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str22 = clientNotification0.getEventTime();
        java.lang.String str23 = clientNotification0.getRequestId();
        java.lang.String str24 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass25 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str22, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str24, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str4 = clientNotification3.getEventType();
        java.lang.String str5 = clientNotification3.getPatientId();
        boolean boolean7 = clientNotification3.equals((java.lang.Object) '4');
        java.lang.String str8 = clientNotification3.toString();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) str8);
        java.lang.String str10 = clientNotification0.getPatientId();
        java.lang.String str11 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str17 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str17, "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.getEventType();
        java.lang.String str15 = clientNotification0.getRequestId();
        java.lang.String str16 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass17 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.toString();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.toString();
        java.lang.String str9 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        java.lang.String str7 = clientNotification0.getEventTime();
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        clientNotification0.setRequestId("hi!");
        java.lang.String str4 = clientNotification0.getEventType();
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass6 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setEventTime("hi!");
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.toString();
        java.lang.String str7 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str10 = clientNotification0.getEventTime();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str7, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!), eventTime=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str8, "ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!), eventTime=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getPatientId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("");
        java.lang.String str9 = clientNotification0.toString();
        java.lang.String str10 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=)" + "'", str9, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=)");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))", "");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        clientNotification0.setRequestId("hi!");
        java.lang.String str4 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        java.lang.String str9 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))" + "'", str9, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str10 = clientNotification4.getPatientId();
        java.lang.String str11 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        boolean boolean5 = clientNotification0.equals((java.lang.Object) 100.0d);
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        java.lang.String str10 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!), eventTime=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=null)");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getPatientId();
        java.lang.String str11 = clientNotification9.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getEventType();
        java.lang.String str14 = clientNotification12.getPatientId();
        boolean boolean16 = clientNotification12.equals((java.lang.Object) '4');
        java.lang.String str17 = clientNotification12.toString();
        boolean boolean18 = clientNotification9.equals((java.lang.Object) str17);
        java.lang.String str19 = clientNotification9.getPatientId();
        boolean boolean20 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.String str21 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean17 = clientNotification8.equals((java.lang.Object) false);
        java.lang.String str18 = clientNotification8.getEventType();
        boolean boolean19 = clientNotification0.equals((java.lang.Object) clientNotification8);
        clientNotification8.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass22 = clientNotification8.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getPatientId();
        java.lang.String str10 = clientNotification0.getPatientId();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str13 = clientNotification0.getEventType();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=hi!)");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventType();
        clientNotification0.setPatientId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getPatientId();
        clientNotification4.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))");
        java.lang.String str8 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))" + "'", str8, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.getEventType();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)", "");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str16 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str16, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str4 = clientNotification3.getRequestId();
        clientNotification3.setEventType("");
        java.lang.String str7 = clientNotification3.getEventTime();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) clientNotification3);
        java.lang.String str9 = clientNotification3.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Object obj7 = null;
        boolean boolean8 = clientNotification4.equals(obj7);
        java.lang.String str9 = clientNotification4.getPatientId();
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        clientNotification0.setRequestId("");
        java.lang.String str12 = clientNotification0.toString();
        java.lang.String str13 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)" + "'", str12, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        java.lang.String str6 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str6, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        clientNotification3.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.toString();
        clientNotification4.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=hi!, patientId=hi!)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str8, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        clientNotification7.setEventType("");
        java.lang.String str11 = clientNotification7.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getRequestId();
        java.lang.String str14 = clientNotification12.getRequestId();
        clientNotification12.setEventType("");
        java.lang.String str17 = clientNotification12.getEventTime();
        boolean boolean18 = clientNotification7.equals((java.lang.Object) str17);
        clientNotification7.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean21 = clientNotification4.equals((java.lang.Object) clientNotification7);
        java.lang.String str22 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification23 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str24 = clientNotification23.getEventType();
        clientNotification23.setRequestId("hi!");
        java.lang.String str27 = clientNotification23.getEventTime();
        clientNotification23.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        clientNotification23.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        boolean boolean32 = clientNotification4.equals((java.lang.Object) clientNotification23);
        clientNotification23.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.Object obj7 = null;
        boolean boolean8 = clientNotification4.equals(obj7);
        java.lang.String str9 = clientNotification4.getPatientId();
        java.lang.String str10 = clientNotification4.getPatientId();
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        java.lang.String str13 = clientNotification4.getEventTime();
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str13, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getEventType();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        clientNotification6.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str12 = clientNotification6.getPatientId();
        clientNotification6.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification6.setPatientId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        boolean boolean17 = clientNotification0.equals((java.lang.Object) clientNotification6);
        clientNotification6.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification9 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str10 = clientNotification9.getRequestId();
        java.lang.String str11 = clientNotification9.getRequestId();
        java.lang.String str12 = clientNotification9.getRequestId();
        java.lang.String str13 = clientNotification9.getPatientId();
        java.lang.String str14 = clientNotification9.toString();
        java.lang.String str15 = clientNotification9.getEventType();
        clientNotification9.setRequestId("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean18 = clientNotification4.equals((java.lang.Object) clientNotification9);
        java.lang.Class<?> wildcardClass19 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str14, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        clientNotification4.setEventTime("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean10 = clientNotification0.equals((java.lang.Object) 100.0f);
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        java.lang.String str13 = clientNotification0.getEventTime();
        java.lang.String str14 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str13, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str14, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        java.lang.String str9 = clientNotification0.getEventType();
        java.lang.String str10 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
        java.lang.String str7 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        clientNotification4.setEventTime("ClientNotification(requestId=hi!, eventType=hi!, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)))");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)", "");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str4 = clientNotification3.getEventType();
        java.lang.String str5 = clientNotification3.getPatientId();
        boolean boolean7 = clientNotification3.equals((java.lang.Object) '4');
        java.lang.String str8 = clientNotification3.toString();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) str8);
        java.lang.String str10 = clientNotification0.getPatientId();
        java.lang.String str11 = clientNotification0.toString();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str14 = clientNotification0.getPatientId();
        java.lang.String str15 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=hi!)");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification3.setPatientId("");
        clientNotification3.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str11 = clientNotification3.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=)" + "'", str11, "ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=)");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=hi!, eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setEventTime("");
        java.lang.String str14 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))" + "'", str14, "ClientNotification(requestId=null, eventType=null, eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str14, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!");
        java.lang.Class<?> wildcardClass5 = clientNotification4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getEventTime();
        clientNotification0.setEventType("");
        java.lang.Class<?> wildcardClass5 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        java.lang.String str9 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        java.lang.String str11 = clientNotification6.getPatientId();
        boolean boolean12 = clientNotification0.equals((java.lang.Object) str11);
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setPatientId("hi!");
        java.lang.String str10 = clientNotification5.getPatientId();
        java.lang.String str11 = clientNotification5.getEventTime();
        boolean boolean13 = clientNotification5.equals((java.lang.Object) 10L);
        clientNotification5.setEventTime("");
        boolean boolean16 = clientNotification0.equals((java.lang.Object) "");
        java.lang.String str17 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        java.lang.String str10 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        java.lang.String str13 = clientNotification8.getEventTime();
        java.lang.String str14 = clientNotification8.getEventTime();
        boolean boolean15 = clientNotification0.equals((java.lang.Object) str14);
        java.lang.String str16 = clientNotification0.getRequestId();
        java.lang.String str17 = clientNotification0.getPatientId();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str17, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getEventTime();
        java.lang.String str6 = clientNotification4.getEventTime();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))" + "'", str6, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str9 = clientNotification0.getPatientId();
        java.lang.String str10 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str7 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "");
        java.lang.String str5 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str14 = clientNotification13.getPatientId();
        java.lang.String str15 = clientNotification13.getPatientId();
        clientNotification13.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str19 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str22 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str19, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str22, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        java.lang.String str6 = clientNotification0.getRequestId();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification15 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification15.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str19 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str19, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification0.getEventType();
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str10, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        java.lang.String str6 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getEventType();
        java.lang.String str9 = clientNotification4.getEventTime();
        clientNotification4.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str14 = clientNotification0.getEventTime();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str17 = clientNotification0.getRequestId();
        java.lang.String str18 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setRequestId("hi!");
        java.lang.String str12 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getEventType();
        java.lang.String str6 = clientNotification0.getEventType();
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.Class<?> wildcardClass8 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        boolean boolean10 = clientNotification4.equals((java.lang.Object) clientNotification5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        java.lang.String str22 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification27 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification27.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str30 = clientNotification27.getRequestId();
        clientNotification27.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean33 = clientNotification3.equals((java.lang.Object) "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification3.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str22, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)" + "'", str30, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!), eventTime=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.toString();
        java.lang.String str7 = clientNotification0.toString();
        java.lang.String str8 = clientNotification0.toString();
        clientNotification0.setPatientId("hi!");
        java.lang.String str11 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!), eventTime=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        boolean boolean5 = clientNotification0.equals((java.lang.Object) 100.0d);
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.String str8 = clientNotification0.getEventType();
        java.lang.String str9 = clientNotification0.toString();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str9, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str9 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=hi!)");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        java.lang.String str12 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))" + "'", str12, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str7 = clientNotification4.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)))");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.toString();
        java.lang.String str11 = clientNotification0.getPatientId();
        java.lang.String str12 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getEventType();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.getRequestId();
        java.lang.String str8 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.Class<?> wildcardClass10 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventType();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "hi!");
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getRequestId();
        java.lang.String str8 = clientNotification4.getPatientId();
        clientNotification4.setEventTime("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getPatientId();
        java.lang.String str10 = clientNotification8.getPatientId();
        java.lang.String str11 = clientNotification8.getEventType();
        clientNotification8.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        boolean boolean14 = clientNotification0.equals((java.lang.Object) clientNotification8);
        clientNotification0.setEventTime("");
        java.lang.String str17 = clientNotification0.getEventTime();
        java.lang.String str18 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        boolean boolean15 = clientNotification0.equals((java.lang.Object) 1.0d);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str8 = clientNotification0.getEventTime();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventType=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!), eventTime=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getEventType();
        boolean boolean8 = clientNotification0.equals((java.lang.Object) 100.0f);
        java.lang.String str9 = clientNotification0.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification14 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification14.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification17 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str18 = clientNotification17.getRequestId();
        clientNotification17.setEventType("");
        java.lang.String str21 = clientNotification17.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification22 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str23 = clientNotification22.getRequestId();
        java.lang.String str24 = clientNotification22.getRequestId();
        clientNotification22.setEventType("");
        java.lang.String str27 = clientNotification22.getEventTime();
        boolean boolean28 = clientNotification17.equals((java.lang.Object) str27);
        clientNotification17.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean31 = clientNotification14.equals((java.lang.Object) clientNotification17);
        java.lang.String str32 = clientNotification14.getPatientId();
        boolean boolean33 = clientNotification0.equals((java.lang.Object) clientNotification14);
        java.lang.String str34 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str21, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification6 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str7 = clientNotification6.getRequestId();
        java.lang.String str8 = clientNotification6.getRequestId();
        java.lang.String str9 = clientNotification6.getRequestId();
        java.lang.String str10 = clientNotification6.getPatientId();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str14 = clientNotification0.toString();
        java.lang.String str15 = clientNotification0.getPatientId();
        java.lang.String str16 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str14, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str15, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=null)");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification13.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        boolean boolean16 = clientNotification4.equals((java.lang.Object) clientNotification13);
        clientNotification4.setPatientId("");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)), patientId=)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=null)");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getEventTime();
        java.lang.String str6 = clientNotification4.getEventType();
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setPatientId("");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass15 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        boolean boolean11 = clientNotification5.equals((java.lang.Object) "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification4.getEventType();
        java.lang.String str8 = clientNotification4.toString();
        java.lang.Class<?> wildcardClass9 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification14 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass15 = clientNotification14.getClass();
        boolean boolean16 = clientNotification0.equals((java.lang.Object) clientNotification14);
        java.lang.Class<?> wildcardClass17 = clientNotification14.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        boolean boolean9 = clientNotification0.equals((java.lang.Object) false);
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getPatientId();
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setPatientId("hi!");
        java.lang.String str10 = clientNotification5.getPatientId();
        java.lang.String str11 = clientNotification5.getEventTime();
        boolean boolean13 = clientNotification5.equals((java.lang.Object) 10L);
        clientNotification5.setEventTime("");
        boolean boolean16 = clientNotification0.equals((java.lang.Object) "");
        clientNotification0.setPatientId("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        java.lang.String str5 = clientNotification4.getRequestId();
        java.lang.String str6 = clientNotification4.getEventType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.toString();
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification14 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str15 = clientNotification14.getRequestId();
        java.lang.String str16 = clientNotification14.getRequestId();
        java.lang.String str17 = clientNotification14.getEventTime();
        java.lang.String str18 = clientNotification14.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification19 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str20 = clientNotification19.getPatientId();
        java.lang.String str21 = clientNotification19.getPatientId();
        java.lang.String str22 = clientNotification19.getEventType();
        boolean boolean23 = clientNotification14.equals((java.lang.Object) clientNotification19);
        java.lang.String str24 = clientNotification14.getEventTime();
        boolean boolean26 = clientNotification14.equals((java.lang.Object) (-1.0f));
        java.lang.String str27 = clientNotification14.getEventTime();
        boolean boolean28 = clientNotification4.equals((java.lang.Object) str27);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str18, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.toString();
        java.lang.String str7 = clientNotification0.getRequestId();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!))", "hi!");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
        java.lang.String str9 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)" + "'", str9, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.toString();
        boolean boolean11 = clientNotification4.equals((java.lang.Object) str10);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str10, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getRequestId();
        boolean boolean7 = clientNotification4.equals((java.lang.Object) 0L);
        java.lang.String str8 = clientNotification4.getPatientId();
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=hi!, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str8, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        clientNotification4.setRequestId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification7 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str8 = clientNotification7.getRequestId();
        clientNotification7.setEventType("");
        java.lang.String str11 = clientNotification7.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification12 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str13 = clientNotification12.getRequestId();
        java.lang.String str14 = clientNotification12.getRequestId();
        clientNotification12.setEventType("");
        java.lang.String str17 = clientNotification12.getEventTime();
        boolean boolean18 = clientNotification7.equals((java.lang.Object) str17);
        clientNotification7.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        boolean boolean21 = clientNotification4.equals((java.lang.Object) clientNotification7);
        java.lang.String str22 = clientNotification4.getPatientId();
        java.lang.String str23 = clientNotification4.getRequestId();
        java.lang.String str24 = clientNotification4.getEventType();
        java.lang.Class<?> wildcardClass25 = clientNotification4.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str23, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str24, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        clientNotification3.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification3.getPatientId();
        java.lang.Class<?> wildcardClass11 = clientNotification3.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!), eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str5 = clientNotification0.getEventTime();
        java.lang.String str6 = clientNotification0.getEventTime();
        java.lang.Class<?> wildcardClass7 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification3 = new com.db.reconciliation.hack_ep.ClientNotification();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) clientNotification3);
        clientNotification3.setEventTime("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification3.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification8 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str9 = clientNotification8.getRequestId();
        clientNotification8.setEventType("");
        clientNotification8.setRequestId("");
        clientNotification8.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification8.setPatientId("hi!");
        clientNotification8.setRequestId("");
        java.lang.String str20 = clientNotification8.getRequestId();
        boolean boolean21 = clientNotification3.equals((java.lang.Object) clientNotification8);
        java.lang.String str22 = clientNotification3.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str22, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("hi!");
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification4.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification4.setEventType("ClientNotification(requestId=, eventType=ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!)");
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getEventTime();
        java.lang.String str12 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str12, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getEventTime();
        clientNotification0.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification0.toString();
        java.lang.String str11 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))" + "'", str10, "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)), eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!))");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)" + "'", str11, "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str10 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.getPatientId();
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getPatientId();
        clientNotification0.setEventType("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        java.lang.String str10 = clientNotification0.getRequestId();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification15 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "hi!", "", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        clientNotification15.setPatientId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        boolean boolean18 = clientNotification0.equals((java.lang.Object) "ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setPatientId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=hi!))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        clientNotification4.setEventTime("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        java.lang.String str7 = clientNotification4.getEventType();
        java.lang.String str8 = clientNotification4.getPatientId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str8, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        clientNotification0.setEventType("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str6 = clientNotification0.getPatientId();
        java.lang.String str7 = clientNotification0.getEventType();
        java.lang.String str8 = clientNotification0.getPatientId();
        java.lang.String str9 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str7, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getEventType();
        java.lang.String str2 = clientNotification0.getPatientId();
        boolean boolean4 = clientNotification0.equals((java.lang.Object) '4');
        clientNotification0.setEventType("");
        java.lang.String str7 = clientNotification0.getEventTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getRequestId();
        java.lang.String str7 = clientNotification5.getRequestId();
        clientNotification5.setEventType("");
        java.lang.String str10 = clientNotification5.getEventTime();
        boolean boolean11 = clientNotification0.equals((java.lang.Object) str10);
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setRequestId("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getEventTime();
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.toString();
        java.lang.Class<?> wildcardClass12 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str11, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventType=null, eventTime=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)), patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getRequestId();
        java.lang.String str4 = clientNotification0.getPatientId();
        java.lang.String str5 = clientNotification0.toString();
        java.lang.String str6 = clientNotification0.toString();
        java.lang.String str7 = clientNotification0.getPatientId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str6, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "", "hi!");
        java.lang.String str5 = clientNotification4.getRequestId();
        java.lang.Class<?> wildcardClass6 = clientNotification4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setEventType("");
        clientNotification0.setRequestId("");
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.Class<?> wildcardClass10 = clientNotification0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)), eventTime=null, patientId=hi!)", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null))", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str5 = clientNotification4.getRequestId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        java.lang.String str2 = clientNotification0.getRequestId();
        java.lang.String str3 = clientNotification0.getEventTime();
        java.lang.String str4 = clientNotification0.toString();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification5 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str6 = clientNotification5.getPatientId();
        java.lang.String str7 = clientNotification5.getPatientId();
        java.lang.String str8 = clientNotification5.getEventType();
        boolean boolean9 = clientNotification0.equals((java.lang.Object) clientNotification5);
        java.lang.String str10 = clientNotification0.getEventTime();
        java.lang.String str11 = clientNotification0.getEventType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)", "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)", "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        clientNotification4.setEventType("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        java.lang.String str7 = clientNotification4.getEventTime();
        java.lang.String str8 = clientNotification4.getEventTime();
        com.db.reconciliation.hack_ep.ClientNotification clientNotification13 = new com.db.reconciliation.hack_ep.ClientNotification("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=, eventType=hi!, eventTime=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=null)", "ClientNotification(requestId=null, eventType=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!), eventTime=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification14 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str15 = clientNotification14.getRequestId();
        java.lang.String str16 = clientNotification14.getRequestId();
        clientNotification14.setEventType("");
        java.lang.String str19 = clientNotification14.toString();
        java.lang.String str20 = clientNotification14.getRequestId();
        java.lang.String str21 = clientNotification14.getRequestId();
        clientNotification14.setEventType("ClientNotification(requestId=hi!, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean24 = clientNotification13.equals((java.lang.Object) clientNotification14);
        boolean boolean25 = clientNotification4.equals((java.lang.Object) clientNotification13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str7, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)" + "'", str8, "ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)" + "'", str19, "ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        java.lang.String str5 = clientNotification0.getRequestId();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null)");
        clientNotification0.setEventType("");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=hi!, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        java.lang.String str4 = clientNotification0.getPatientId();
        clientNotification0.setRequestId("ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)");
        clientNotification0.setRequestId("ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
        boolean boolean10 = clientNotification0.equals((java.lang.Object) 100.0f);
        clientNotification0.setRequestId("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventTime=, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification11 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)", "", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        java.lang.String str12 = clientNotification11.getEventTime();
        clientNotification11.setEventType("ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null)");
        java.lang.String str15 = clientNotification11.getEventTime();
        boolean boolean16 = clientNotification4.equals((java.lang.Object) str15);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getRequestId();
        clientNotification0.setRequestId("");
        java.lang.String str4 = clientNotification0.toString();
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)" + "'", str4, "ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null)");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("hi!", "hi!", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), eventType=, eventTime=ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), patientId=ClientNotification(requestId=null, eventType=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null), eventTime=null, patientId=null))");
        java.lang.String str5 = clientNotification4.getEventTime();
        clientNotification4.setEventType("ClientNotification(requestId=ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)), eventType=null, eventTime=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=ClientNotification(requestId=hi!, eventType=, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=hi!)), patientId=null)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))" + "'", str5, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification4 = new com.db.reconciliation.hack_ep.ClientNotification("", "ClientNotification(requestId=, eventType=, eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null))", "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=hi!)", "ClientNotification(requestId=, eventType=, eventTime=null, patientId=ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null))");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        com.db.reconciliation.hack_ep.ClientNotification clientNotification0 = new com.db.reconciliation.hack_ep.ClientNotification();
        java.lang.String str1 = clientNotification0.getPatientId();
        java.lang.String str2 = clientNotification0.toString();
        java.lang.String str3 = clientNotification0.toString();
        clientNotification0.setPatientId("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        clientNotification0.setEventTime("ClientNotification(requestId=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), eventType=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null), eventTime=ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null), patientId=ClientNotification(requestId=null, eventType=, eventTime=null, patientId=null))");
        clientNotification0.setEventTime("ClientNotification(requestId=null, eventType=null, eventTime=ClientNotification(requestId=, eventType=null, eventTime=null, patientId=null), patientId=null)");
        java.lang.String str10 = clientNotification0.getEventType();
        java.lang.String str11 = clientNotification0.getRequestId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str2, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)" + "'", str3, "ClientNotification(requestId=null, eventType=null, eventTime=null, patientId=null)");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }
}

