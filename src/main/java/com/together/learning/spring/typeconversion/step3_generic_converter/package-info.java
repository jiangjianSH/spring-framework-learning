package com.together.learning.spring.typeconversion.step3_generic_converter;
/**
 * 请了解如下内容:
 *
 * A good example of a GenericConverter is a converter that converts
 * between a Java array and a collection. Such an ArrayToCollectionConverter
 * introspects the field that declares the target collection type to resolve
 * the collection’s element type. This lets each element in the source array be
 * converted to the collection element type before the collection is set on the
 * target field.
 *
 *
 * Because GenericConverter is a more complex SPI interface, you should use it
 * only when you need it. Favor Converter or ConverterFactory for basic type conversion needs.
 * 可以参考:
 *
 * @see org.springframework.core.convert.support.ArrayToCollectionConverter
 * @author jiangjian
 */