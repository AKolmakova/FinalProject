package com.kolmakova.TattooSalonProject.entity;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.InputStream;

@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {

    @Test
    public void checkValue() {
    }

    @Test
    public void getResource() {

        String str = "/resources/{id}"
                .replace("{id}", "1");
        Integer.parseInt(str);
    }
}