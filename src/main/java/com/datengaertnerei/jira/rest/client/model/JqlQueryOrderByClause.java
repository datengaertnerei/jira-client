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
import com.datengaertnerei.jira.rest.client.model.JqlQueryOrderByClauseElement;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Details of the order-by JQL clause.
 */
@ApiModel(description = "Details of the order-by JQL clause.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class JqlQueryOrderByClause {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<JqlQueryOrderByClauseElement> fields = new ArrayList<>();


  public JqlQueryOrderByClause fields(List<JqlQueryOrderByClauseElement> fields) {
    
    this.fields = fields;
    return this;
  }

  public JqlQueryOrderByClause addFieldsItem(JqlQueryOrderByClauseElement fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * The list of order-by clause fields and their ordering directives.
   * @return fields
  **/
  @ApiModelProperty(required = true, value = "The list of order-by clause fields and their ordering directives.")

  public List<JqlQueryOrderByClauseElement> getFields() {
    return fields;
  }


  public void setFields(List<JqlQueryOrderByClauseElement> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JqlQueryOrderByClause jqlQueryOrderByClause = (JqlQueryOrderByClause) o;
    return Objects.equals(this.fields, jqlQueryOrderByClause.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryOrderByClause {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

