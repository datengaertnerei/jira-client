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
import com.datengaertnerei.jira.rest.client.model.SecurityScheme;
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
 * List of security schemes.
 */
@ApiModel(description = "List of security schemes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class SecuritySchemes {
  public static final String SERIALIZED_NAME_ISSUE_SECURITY_SCHEMES = "issueSecuritySchemes";
  @SerializedName(SERIALIZED_NAME_ISSUE_SECURITY_SCHEMES)
  private List<SecurityScheme> issueSecuritySchemes = null;


   /**
   * List of security schemes.
   * @return issueSecuritySchemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of security schemes.")

  public List<SecurityScheme> getIssueSecuritySchemes() {
    return issueSecuritySchemes;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecuritySchemes securitySchemes = (SecuritySchemes) o;
    return Objects.equals(this.issueSecuritySchemes, securitySchemes.issueSecuritySchemes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueSecuritySchemes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecuritySchemes {\n");
    sb.append("    issueSecuritySchemes: ").append(toIndentedString(issueSecuritySchemes)).append("\n");
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
