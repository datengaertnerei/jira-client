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
 * The JQL specifying the issues available in the evaluated Jira expression under the &#x60;issues&#x60; context variable. Not all issues returned by the JQL query are loaded, only those described by the &#x60;startAt&#x60; and &#x60;maxResults&#x60; properties. To determine whether it is necessary to iterate to ensure all the issues returned by the JQL query are evaluated, inspect &#x60;meta.issues.jql.count&#x60; in the response.
 */
@ApiModel(description = "The JQL specifying the issues available in the evaluated Jira expression under the `issues` context variable. Not all issues returned by the JQL query are loaded, only those described by the `startAt` and `maxResults` properties. To determine whether it is necessary to iterate to ensure all the issues returned by the JQL query are evaluated, inspect `meta.issues.jql.count` in the response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class JexpJqlIssues {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Long startAt;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  /**
   * Determines how to validate the JQL query and treat the validation results.
   */
  @JsonAdapter(ValidationEnum.Adapter.class)
  public enum ValidationEnum {
    STRICT("strict"),
    
    WARN("warn"),
    
    NONE("none");

    private String value;

    ValidationEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ValidationEnum fromValue(String value) {
      for (ValidationEnum b : ValidationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ValidationEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ValidationEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ValidationEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ValidationEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_VALIDATION = "validation";
  @SerializedName(SERIALIZED_NAME_VALIDATION)
  private ValidationEnum validation = ValidationEnum.STRICT;


  public JexpJqlIssues query(String query) {
    
    this.query = query;
    return this;
  }

   /**
   * The JQL query.
   * @return query
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The JQL query.")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    this.query = query;
  }


  public JexpJqlIssues startAt(Long startAt) {
    
    this.startAt = startAt;
    return this;
  }

   /**
   * The index of the first issue to return from the JQL query.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first issue to return from the JQL query.")

  public Long getStartAt() {
    return startAt;
  }


  public void setStartAt(Long startAt) {
    this.startAt = startAt;
  }


  public JexpJqlIssues maxResults(Integer maxResults) {
    
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of issues to return from the JQL query. Inspect &#x60;meta.issues.jql.maxResults&#x60; in the response to ensure the maximum value has not been exceeded.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.")

  public Integer getMaxResults() {
    return maxResults;
  }


  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public JexpJqlIssues validation(ValidationEnum validation) {
    
    this.validation = validation;
    return this;
  }

   /**
   * Determines how to validate the JQL query and treat the validation results.
   * @return validation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Determines how to validate the JQL query and treat the validation results.")

  public ValidationEnum getValidation() {
    return validation;
  }


  public void setValidation(ValidationEnum validation) {
    this.validation = validation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JexpJqlIssues jexpJqlIssues = (JexpJqlIssues) o;
    return Objects.equals(this.query, jexpJqlIssues.query) &&
        Objects.equals(this.startAt, jexpJqlIssues.startAt) &&
        Objects.equals(this.maxResults, jexpJqlIssues.maxResults) &&
        Objects.equals(this.validation, jexpJqlIssues.validation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, startAt, maxResults, validation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JexpJqlIssues {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    validation: ").append(toIndentedString(validation)).append("\n");
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
