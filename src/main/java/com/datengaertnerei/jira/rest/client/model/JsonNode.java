/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datengaertnerei.jira.rest.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * JsonNode
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class JsonNode {
  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private Object elements;

  public static final String SERIALIZED_NAME_POJO = "pojo";
  @SerializedName(SERIALIZED_NAME_POJO)
  private Boolean pojo;

  public static final String SERIALIZED_NAME_CONTAINER_NODE = "containerNode";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NODE)
  private Boolean containerNode;

  public static final String SERIALIZED_NAME_MISSING_NODE = "missingNode";
  @SerializedName(SERIALIZED_NAME_MISSING_NODE)
  private Boolean missingNode;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private Boolean _object;

  public static final String SERIALIZED_NAME_VALUE_NODE = "valueNode";
  @SerializedName(SERIALIZED_NAME_VALUE_NODE)
  private Boolean valueNode;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private Boolean number;

  public static final String SERIALIZED_NAME_INTEGRAL_NUMBER = "integralNumber";
  @SerializedName(SERIALIZED_NAME_INTEGRAL_NUMBER)
  private Boolean integralNumber;

  public static final String SERIALIZED_NAME_FLOATING_POINT_NUMBER = "floatingPointNumber";
  @SerializedName(SERIALIZED_NAME_FLOATING_POINT_NUMBER)
  private Boolean floatingPointNumber;

  public static final String SERIALIZED_NAME_INT = "int";
  @SerializedName(SERIALIZED_NAME_INT)
  private Boolean _int;

  public static final String SERIALIZED_NAME_LONG = "long";
  @SerializedName(SERIALIZED_NAME_LONG)
  private Boolean _long;

  public static final String SERIALIZED_NAME_DOUBLE = "double";
  @SerializedName(SERIALIZED_NAME_DOUBLE)
  private Boolean _double;

  public static final String SERIALIZED_NAME_BIG_DECIMAL = "bigDecimal";
  @SerializedName(SERIALIZED_NAME_BIG_DECIMAL)
  private Boolean bigDecimal;

  public static final String SERIALIZED_NAME_BIG_INTEGER = "bigInteger";
  @SerializedName(SERIALIZED_NAME_BIG_INTEGER)
  private Boolean bigInteger;

  public static final String SERIALIZED_NAME_TEXTUAL = "textual";
  @SerializedName(SERIALIZED_NAME_TEXTUAL)
  private Boolean textual;

  public static final String SERIALIZED_NAME_BOOLEAN = "boolean";
  @SerializedName(SERIALIZED_NAME_BOOLEAN)
  private Boolean _boolean;

  public static final String SERIALIZED_NAME_BINARY = "binary";
  @SerializedName(SERIALIZED_NAME_BINARY)
  private Boolean binary;

  public static final String SERIALIZED_NAME_NUMBER_VALUE = "numberValue";
  @SerializedName(SERIALIZED_NAME_NUMBER_VALUE)
  private BigDecimal numberValue;

  /**
   * Gets or Sets numberType
   */
  @JsonAdapter(NumberTypeEnum.Adapter.class)
  public enum NumberTypeEnum {
    INT("INT"),
    
    LONG("LONG"),
    
    BIG_INTEGER("BIG_INTEGER"),
    
    FLOAT("FLOAT"),
    
    DOUBLE("DOUBLE"),
    
    BIG_DECIMAL("BIG_DECIMAL");

    private String value;

    NumberTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NumberTypeEnum fromValue(String value) {
      for (NumberTypeEnum b : NumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<NumberTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NumberTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NumberTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return NumberTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_NUMBER_TYPE = "numberType";
  @SerializedName(SERIALIZED_NAME_NUMBER_TYPE)
  private NumberTypeEnum numberType;

  public static final String SERIALIZED_NAME_INT_VALUE = "intValue";
  @SerializedName(SERIALIZED_NAME_INT_VALUE)
  private Integer intValue;

  public static final String SERIALIZED_NAME_LONG_VALUE = "longValue";
  @SerializedName(SERIALIZED_NAME_LONG_VALUE)
  private Long longValue;

  public static final String SERIALIZED_NAME_BIG_INTEGER_VALUE = "bigIntegerValue";
  @SerializedName(SERIALIZED_NAME_BIG_INTEGER_VALUE)
  private Integer bigIntegerValue;

  public static final String SERIALIZED_NAME_DOUBLE_VALUE = "doubleValue";
  @SerializedName(SERIALIZED_NAME_DOUBLE_VALUE)
  private Double doubleValue;

  public static final String SERIALIZED_NAME_DECIMAL_VALUE = "decimalValue";
  @SerializedName(SERIALIZED_NAME_DECIMAL_VALUE)
  private BigDecimal decimalValue;

  public static final String SERIALIZED_NAME_BOOLEAN_VALUE = "booleanValue";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_VALUE)
  private Boolean booleanValue;

  public static final String SERIALIZED_NAME_BINARY_VALUE = "binaryValue";
  @SerializedName(SERIALIZED_NAME_BINARY_VALUE)
  private List<byte[]> binaryValue = null;

  public static final String SERIALIZED_NAME_VALUE_AS_INT = "valueAsInt";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_INT)
  private Integer valueAsInt;

  public static final String SERIALIZED_NAME_VALUE_AS_LONG = "valueAsLong";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_LONG)
  private Long valueAsLong;

  public static final String SERIALIZED_NAME_VALUE_AS_DOUBLE = "valueAsDouble";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_DOUBLE)
  private Double valueAsDouble;

  public static final String SERIALIZED_NAME_VALUE_AS_BOOLEAN = "valueAsBoolean";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_BOOLEAN)
  private Boolean valueAsBoolean;

  public static final String SERIALIZED_NAME_TEXT_VALUE = "textValue";
  @SerializedName(SERIALIZED_NAME_TEXT_VALUE)
  private String textValue;

  public static final String SERIALIZED_NAME_VALUE_AS_TEXT = "valueAsText";
  @SerializedName(SERIALIZED_NAME_VALUE_AS_TEXT)
  private String valueAsText;

  public static final String SERIALIZED_NAME_FIELD_NAMES = "fieldNames";
  @SerializedName(SERIALIZED_NAME_FIELD_NAMES)
  private Object fieldNames;

  public static final String SERIALIZED_NAME_ARRAY = "array";
  @SerializedName(SERIALIZED_NAME_ARRAY)
  private Boolean array;

  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Object fields;

  public static final String SERIALIZED_NAME_NULL = "null";
  @SerializedName(SERIALIZED_NAME_NULL)
  private Boolean _null;


  public JsonNode elements(Object elements) {
    
    this.elements = elements;
    return this;
  }

   /**
   * Get elements
   * @return elements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getElements() {
    return elements;
  }


  public void setElements(Object elements) {
    this.elements = elements;
  }


  public JsonNode pojo(Boolean pojo) {
    
    this.pojo = pojo;
    return this;
  }

   /**
   * Get pojo
   * @return pojo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPojo() {
    return pojo;
  }


  public void setPojo(Boolean pojo) {
    this.pojo = pojo;
  }


  public JsonNode containerNode(Boolean containerNode) {
    
    this.containerNode = containerNode;
    return this;
  }

   /**
   * Get containerNode
   * @return containerNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getContainerNode() {
    return containerNode;
  }


  public void setContainerNode(Boolean containerNode) {
    this.containerNode = containerNode;
  }


  public JsonNode missingNode(Boolean missingNode) {
    
    this.missingNode = missingNode;
    return this;
  }

   /**
   * Get missingNode
   * @return missingNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMissingNode() {
    return missingNode;
  }


  public void setMissingNode(Boolean missingNode) {
    this.missingNode = missingNode;
  }


  public JsonNode _object(Boolean _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getObject() {
    return _object;
  }


  public void setObject(Boolean _object) {
    this._object = _object;
  }


  public JsonNode valueNode(Boolean valueNode) {
    
    this.valueNode = valueNode;
    return this;
  }

   /**
   * Get valueNode
   * @return valueNode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValueNode() {
    return valueNode;
  }


  public void setValueNode(Boolean valueNode) {
    this.valueNode = valueNode;
  }


  public JsonNode number(Boolean number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNumber() {
    return number;
  }


  public void setNumber(Boolean number) {
    this.number = number;
  }


  public JsonNode integralNumber(Boolean integralNumber) {
    
    this.integralNumber = integralNumber;
    return this;
  }

   /**
   * Get integralNumber
   * @return integralNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIntegralNumber() {
    return integralNumber;
  }


  public void setIntegralNumber(Boolean integralNumber) {
    this.integralNumber = integralNumber;
  }


  public JsonNode floatingPointNumber(Boolean floatingPointNumber) {
    
    this.floatingPointNumber = floatingPointNumber;
    return this;
  }

   /**
   * Get floatingPointNumber
   * @return floatingPointNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFloatingPointNumber() {
    return floatingPointNumber;
  }


  public void setFloatingPointNumber(Boolean floatingPointNumber) {
    this.floatingPointNumber = floatingPointNumber;
  }


  public JsonNode _int(Boolean _int) {
    
    this._int = _int;
    return this;
  }

   /**
   * Get _int
   * @return _int
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInt() {
    return _int;
  }


  public void setInt(Boolean _int) {
    this._int = _int;
  }


  public JsonNode _long(Boolean _long) {
    
    this._long = _long;
    return this;
  }

   /**
   * Get _long
   * @return _long
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLong() {
    return _long;
  }


  public void setLong(Boolean _long) {
    this._long = _long;
  }


  public JsonNode _double(Boolean _double) {
    
    this._double = _double;
    return this;
  }

   /**
   * Get _double
   * @return _double
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDouble() {
    return _double;
  }


  public void setDouble(Boolean _double) {
    this._double = _double;
  }


  public JsonNode bigDecimal(Boolean bigDecimal) {
    
    this.bigDecimal = bigDecimal;
    return this;
  }

   /**
   * Get bigDecimal
   * @return bigDecimal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBigDecimal() {
    return bigDecimal;
  }


  public void setBigDecimal(Boolean bigDecimal) {
    this.bigDecimal = bigDecimal;
  }


  public JsonNode bigInteger(Boolean bigInteger) {
    
    this.bigInteger = bigInteger;
    return this;
  }

   /**
   * Get bigInteger
   * @return bigInteger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBigInteger() {
    return bigInteger;
  }


  public void setBigInteger(Boolean bigInteger) {
    this.bigInteger = bigInteger;
  }


  public JsonNode textual(Boolean textual) {
    
    this.textual = textual;
    return this;
  }

   /**
   * Get textual
   * @return textual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTextual() {
    return textual;
  }


  public void setTextual(Boolean textual) {
    this.textual = textual;
  }


  public JsonNode _boolean(Boolean _boolean) {
    
    this._boolean = _boolean;
    return this;
  }

   /**
   * Get _boolean
   * @return _boolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBoolean() {
    return _boolean;
  }


  public void setBoolean(Boolean _boolean) {
    this._boolean = _boolean;
  }


  public JsonNode binary(Boolean binary) {
    
    this.binary = binary;
    return this;
  }

   /**
   * Get binary
   * @return binary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBinary() {
    return binary;
  }


  public void setBinary(Boolean binary) {
    this.binary = binary;
  }


  public JsonNode numberValue(BigDecimal numberValue) {
    
    this.numberValue = numberValue;
    return this;
  }

   /**
   * Get numberValue
   * @return numberValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getNumberValue() {
    return numberValue;
  }


  public void setNumberValue(BigDecimal numberValue) {
    this.numberValue = numberValue;
  }


  public JsonNode numberType(NumberTypeEnum numberType) {
    
    this.numberType = numberType;
    return this;
  }

   /**
   * Get numberType
   * @return numberType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NumberTypeEnum getNumberType() {
    return numberType;
  }


  public void setNumberType(NumberTypeEnum numberType) {
    this.numberType = numberType;
  }


  public JsonNode intValue(Integer intValue) {
    
    this.intValue = intValue;
    return this;
  }

   /**
   * Get intValue
   * @return intValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIntValue() {
    return intValue;
  }


  public void setIntValue(Integer intValue) {
    this.intValue = intValue;
  }


  public JsonNode longValue(Long longValue) {
    
    this.longValue = longValue;
    return this;
  }

   /**
   * Get longValue
   * @return longValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLongValue() {
    return longValue;
  }


  public void setLongValue(Long longValue) {
    this.longValue = longValue;
  }


  public JsonNode bigIntegerValue(Integer bigIntegerValue) {
    
    this.bigIntegerValue = bigIntegerValue;
    return this;
  }

   /**
   * Get bigIntegerValue
   * @return bigIntegerValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBigIntegerValue() {
    return bigIntegerValue;
  }


  public void setBigIntegerValue(Integer bigIntegerValue) {
    this.bigIntegerValue = bigIntegerValue;
  }


  public JsonNode doubleValue(Double doubleValue) {
    
    this.doubleValue = doubleValue;
    return this;
  }

   /**
   * Get doubleValue
   * @return doubleValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getDoubleValue() {
    return doubleValue;
  }


  public void setDoubleValue(Double doubleValue) {
    this.doubleValue = doubleValue;
  }


  public JsonNode decimalValue(BigDecimal decimalValue) {
    
    this.decimalValue = decimalValue;
    return this;
  }

   /**
   * Get decimalValue
   * @return decimalValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getDecimalValue() {
    return decimalValue;
  }


  public void setDecimalValue(BigDecimal decimalValue) {
    this.decimalValue = decimalValue;
  }


  public JsonNode booleanValue(Boolean booleanValue) {
    
    this.booleanValue = booleanValue;
    return this;
  }

   /**
   * Get booleanValue
   * @return booleanValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getBooleanValue() {
    return booleanValue;
  }


  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }


  public JsonNode binaryValue(List<byte[]> binaryValue) {
    
    this.binaryValue = binaryValue;
    return this;
  }

  public JsonNode addBinaryValueItem(byte[] binaryValueItem) {
    if (this.binaryValue == null) {
      this.binaryValue = new ArrayList<>();
    }
    this.binaryValue.add(binaryValueItem);
    return this;
  }

   /**
   * Get binaryValue
   * @return binaryValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<byte[]> getBinaryValue() {
    return binaryValue;
  }


  public void setBinaryValue(List<byte[]> binaryValue) {
    this.binaryValue = binaryValue;
  }


  public JsonNode valueAsInt(Integer valueAsInt) {
    
    this.valueAsInt = valueAsInt;
    return this;
  }

   /**
   * Get valueAsInt
   * @return valueAsInt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValueAsInt() {
    return valueAsInt;
  }


  public void setValueAsInt(Integer valueAsInt) {
    this.valueAsInt = valueAsInt;
  }


  public JsonNode valueAsLong(Long valueAsLong) {
    
    this.valueAsLong = valueAsLong;
    return this;
  }

   /**
   * Get valueAsLong
   * @return valueAsLong
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getValueAsLong() {
    return valueAsLong;
  }


  public void setValueAsLong(Long valueAsLong) {
    this.valueAsLong = valueAsLong;
  }


  public JsonNode valueAsDouble(Double valueAsDouble) {
    
    this.valueAsDouble = valueAsDouble;
    return this;
  }

   /**
   * Get valueAsDouble
   * @return valueAsDouble
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Double getValueAsDouble() {
    return valueAsDouble;
  }


  public void setValueAsDouble(Double valueAsDouble) {
    this.valueAsDouble = valueAsDouble;
  }


  public JsonNode valueAsBoolean(Boolean valueAsBoolean) {
    
    this.valueAsBoolean = valueAsBoolean;
    return this;
  }

   /**
   * Get valueAsBoolean
   * @return valueAsBoolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getValueAsBoolean() {
    return valueAsBoolean;
  }


  public void setValueAsBoolean(Boolean valueAsBoolean) {
    this.valueAsBoolean = valueAsBoolean;
  }


  public JsonNode textValue(String textValue) {
    
    this.textValue = textValue;
    return this;
  }

   /**
   * Get textValue
   * @return textValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTextValue() {
    return textValue;
  }


  public void setTextValue(String textValue) {
    this.textValue = textValue;
  }


  public JsonNode valueAsText(String valueAsText) {
    
    this.valueAsText = valueAsText;
    return this;
  }

   /**
   * Get valueAsText
   * @return valueAsText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValueAsText() {
    return valueAsText;
  }


  public void setValueAsText(String valueAsText) {
    this.valueAsText = valueAsText;
  }


  public JsonNode fieldNames(Object fieldNames) {
    
    this.fieldNames = fieldNames;
    return this;
  }

   /**
   * Get fieldNames
   * @return fieldNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFieldNames() {
    return fieldNames;
  }


  public void setFieldNames(Object fieldNames) {
    this.fieldNames = fieldNames;
  }


  public JsonNode array(Boolean array) {
    
    this.array = array;
    return this;
  }

   /**
   * Get array
   * @return array
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getArray() {
    return array;
  }


  public void setArray(Boolean array) {
    this.array = array;
  }


  public JsonNode fields(Object fields) {
    
    this.fields = fields;
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getFields() {
    return fields;
  }


  public void setFields(Object fields) {
    this.fields = fields;
  }


  public JsonNode _null(Boolean _null) {
    
    this._null = _null;
    return this;
  }

   /**
   * Get _null
   * @return _null
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNull() {
    return _null;
  }


  public void setNull(Boolean _null) {
    this._null = _null;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonNode jsonNode = (JsonNode) o;
    return Objects.equals(this.elements, jsonNode.elements) &&
        Objects.equals(this.pojo, jsonNode.pojo) &&
        Objects.equals(this.containerNode, jsonNode.containerNode) &&
        Objects.equals(this.missingNode, jsonNode.missingNode) &&
        Objects.equals(this._object, jsonNode._object) &&
        Objects.equals(this.valueNode, jsonNode.valueNode) &&
        Objects.equals(this.number, jsonNode.number) &&
        Objects.equals(this.integralNumber, jsonNode.integralNumber) &&
        Objects.equals(this.floatingPointNumber, jsonNode.floatingPointNumber) &&
        Objects.equals(this._int, jsonNode._int) &&
        Objects.equals(this._long, jsonNode._long) &&
        Objects.equals(this._double, jsonNode._double) &&
        Objects.equals(this.bigDecimal, jsonNode.bigDecimal) &&
        Objects.equals(this.bigInteger, jsonNode.bigInteger) &&
        Objects.equals(this.textual, jsonNode.textual) &&
        Objects.equals(this._boolean, jsonNode._boolean) &&
        Objects.equals(this.binary, jsonNode.binary) &&
        Objects.equals(this.numberValue, jsonNode.numberValue) &&
        Objects.equals(this.numberType, jsonNode.numberType) &&
        Objects.equals(this.intValue, jsonNode.intValue) &&
        Objects.equals(this.longValue, jsonNode.longValue) &&
        Objects.equals(this.bigIntegerValue, jsonNode.bigIntegerValue) &&
        Objects.equals(this.doubleValue, jsonNode.doubleValue) &&
        Objects.equals(this.decimalValue, jsonNode.decimalValue) &&
        Objects.equals(this.booleanValue, jsonNode.booleanValue) &&
        Objects.equals(this.binaryValue, jsonNode.binaryValue) &&
        Objects.equals(this.valueAsInt, jsonNode.valueAsInt) &&
        Objects.equals(this.valueAsLong, jsonNode.valueAsLong) &&
        Objects.equals(this.valueAsDouble, jsonNode.valueAsDouble) &&
        Objects.equals(this.valueAsBoolean, jsonNode.valueAsBoolean) &&
        Objects.equals(this.textValue, jsonNode.textValue) &&
        Objects.equals(this.valueAsText, jsonNode.valueAsText) &&
        Objects.equals(this.fieldNames, jsonNode.fieldNames) &&
        Objects.equals(this.array, jsonNode.array) &&
        Objects.equals(this.fields, jsonNode.fields) &&
        Objects.equals(this._null, jsonNode._null);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, pojo, containerNode, missingNode, _object, valueNode, number, integralNumber, floatingPointNumber, _int, _long, _double, bigDecimal, bigInteger, textual, _boolean, binary, numberValue, numberType, intValue, longValue, bigIntegerValue, doubleValue, decimalValue, booleanValue, binaryValue, valueAsInt, valueAsLong, valueAsDouble, valueAsBoolean, textValue, valueAsText, fieldNames, array, fields, _null);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonNode {\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    pojo: ").append(toIndentedString(pojo)).append("\n");
    sb.append("    containerNode: ").append(toIndentedString(containerNode)).append("\n");
    sb.append("    missingNode: ").append(toIndentedString(missingNode)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    valueNode: ").append(toIndentedString(valueNode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    integralNumber: ").append(toIndentedString(integralNumber)).append("\n");
    sb.append("    floatingPointNumber: ").append(toIndentedString(floatingPointNumber)).append("\n");
    sb.append("    _int: ").append(toIndentedString(_int)).append("\n");
    sb.append("    _long: ").append(toIndentedString(_long)).append("\n");
    sb.append("    _double: ").append(toIndentedString(_double)).append("\n");
    sb.append("    bigDecimal: ").append(toIndentedString(bigDecimal)).append("\n");
    sb.append("    bigInteger: ").append(toIndentedString(bigInteger)).append("\n");
    sb.append("    textual: ").append(toIndentedString(textual)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
    sb.append("    numberValue: ").append(toIndentedString(numberValue)).append("\n");
    sb.append("    numberType: ").append(toIndentedString(numberType)).append("\n");
    sb.append("    intValue: ").append(toIndentedString(intValue)).append("\n");
    sb.append("    longValue: ").append(toIndentedString(longValue)).append("\n");
    sb.append("    bigIntegerValue: ").append(toIndentedString(bigIntegerValue)).append("\n");
    sb.append("    doubleValue: ").append(toIndentedString(doubleValue)).append("\n");
    sb.append("    decimalValue: ").append(toIndentedString(decimalValue)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    binaryValue: ").append(toIndentedString(binaryValue)).append("\n");
    sb.append("    valueAsInt: ").append(toIndentedString(valueAsInt)).append("\n");
    sb.append("    valueAsLong: ").append(toIndentedString(valueAsLong)).append("\n");
    sb.append("    valueAsDouble: ").append(toIndentedString(valueAsDouble)).append("\n");
    sb.append("    valueAsBoolean: ").append(toIndentedString(valueAsBoolean)).append("\n");
    sb.append("    textValue: ").append(toIndentedString(textValue)).append("\n");
    sb.append("    valueAsText: ").append(toIndentedString(valueAsText)).append("\n");
    sb.append("    fieldNames: ").append(toIndentedString(fieldNames)).append("\n");
    sb.append("    array: ").append(toIndentedString(array)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
