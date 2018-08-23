/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.azure.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner{

    @Value("${uri}")
    private String uri;

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    public void run(String... args) {
        System.out.println("PRint uri:" + uri);
    }
}
