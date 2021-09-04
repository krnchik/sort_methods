package com.dataStructures.patterns.structural.decorator;


import java.util.Base64;

public class DecryptionDecorator extends DataSourceDecorator{

    public DecryptionDecorator(DataSource dataSource) {
        super(dataSource);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data);
    }

    @Override
    public String readData() {
        String value = super.readData();
        return decode(value);
    }

    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }
}
