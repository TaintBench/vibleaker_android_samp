package org.springframework.core.convert.converter;

import org.springframework.core.convert.TypeDescriptor;

public interface ConditionalConverter {
    boolean matches(TypeDescriptor typeDescriptor, TypeDescriptor typeDescriptor2);
}
