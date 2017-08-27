@Test
    public void runHangMan_checkIfCityCOntainsACity_true(){
        HangMan testHangMan = new HangMan();
        boolean city = false;
        String [] check = testHangMan.getCities();
        List<String> list = Arrays.asList(check);

        if(list.contains("belgrade")){
            city = false;
        }

        assertEquals(true, city);
    }
