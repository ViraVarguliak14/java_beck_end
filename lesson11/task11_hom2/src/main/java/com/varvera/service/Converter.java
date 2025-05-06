package com.varvera.service;

import com.varvera.model.Conversion;

public interface Converter {
    Conversion convert(String from, String to, double amount);
}
