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

/**
 * JQL queries that contained users that could not be found
 */
@ApiModel(description = "JQL queries that contained users that could not be found")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class JQLQueryWithUnknownUsers {
  public static final String SERIALIZED_NAME_ORIGINAL_QUERY = "originalQuery";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_QUERY)
  private String originalQuery;

  public static final String SERIALIZED_NAME_CONVERTED_QUERY = "convertedQuery";
  @SerializedName(SERIALIZED_NAME_CONVERTED_QUERY)
  private String convertedQuery;


  public JQLQueryWithUnknownUsers originalQuery(String originalQuery) {
    
    this.originalQuery = originalQuery;
    return this;
  }

   /**
   * The original query, for reference
   * @return originalQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original query, for reference")

  public String getOriginalQuery() {
    return originalQuery;
  }


  public void setOriginalQuery(String originalQuery) {
    this.originalQuery = originalQuery;
  }


  public JQLQueryWithUnknownUsers convertedQuery(String convertedQuery) {
    
    this.convertedQuery = convertedQuery;
    return this;
  }

   /**
   * The converted query, with accountIDs instead of user identifiers, or &#39;unknown&#39; for users that could not be found
   * @return convertedQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The converted query, with accountIDs instead of user identifiers, or 'unknown' for users that could not be found")

  public String getConvertedQuery() {
    return convertedQuery;
  }


  public void setConvertedQuery(String convertedQuery) {
    this.convertedQuery = convertedQuery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JQLQueryWithUnknownUsers jqLQueryWithUnknownUsers = (JQLQueryWithUnknownUsers) o;
    return Objects.equals(this.originalQuery, jqLQueryWithUnknownUsers.originalQuery) &&
        Objects.equals(this.convertedQuery, jqLQueryWithUnknownUsers.convertedQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalQuery, convertedQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLQueryWithUnknownUsers {\n");
    sb.append("    originalQuery: ").append(toIndentedString(originalQuery)).append("\n");
    sb.append("    convertedQuery: ").append(toIndentedString(convertedQuery)).append("\n");
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

