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
import com.datengaertnerei.jira.rest.client.model.JiraExpressionAnalysis;
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
 * Details about the analysed Jira expression.
 */
@ApiModel(description = "Details about the analysed Jira expression.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class JiraExpressionsAnalysis {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<JiraExpressionAnalysis> results = new ArrayList<>();


  public JiraExpressionsAnalysis results(List<JiraExpressionAnalysis> results) {
    
    this.results = results;
    return this;
  }

  public JiraExpressionsAnalysis addResultsItem(JiraExpressionAnalysis resultsItem) {
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The results of Jira expressions analysis.
   * @return results
  **/
  @ApiModelProperty(required = true, value = "The results of Jira expressions analysis.")

  public List<JiraExpressionAnalysis> getResults() {
    return results;
  }


  public void setResults(List<JiraExpressionAnalysis> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JiraExpressionsAnalysis jiraExpressionsAnalysis = (JiraExpressionsAnalysis) o;
    return Objects.equals(this.results, jiraExpressionsAnalysis.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraExpressionsAnalysis {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

