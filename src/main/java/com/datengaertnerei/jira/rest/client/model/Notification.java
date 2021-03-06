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
import com.datengaertnerei.jira.rest.client.model.NotificationRecipients;
import com.datengaertnerei.jira.rest.client.model.NotificationRecipientsRestrictions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Details about a notification.
 */
@ApiModel(description = "Details about a notification.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class Notification extends HashMap<String, Object> {
  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_TEXT_BODY = "textBody";
  @SerializedName(SERIALIZED_NAME_TEXT_BODY)
  private String textBody;

  public static final String SERIALIZED_NAME_HTML_BODY = "htmlBody";
  @SerializedName(SERIALIZED_NAME_HTML_BODY)
  private String htmlBody;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private NotificationRecipients to;

  public static final String SERIALIZED_NAME_RESTRICT = "restrict";
  @SerializedName(SERIALIZED_NAME_RESTRICT)
  private NotificationRecipientsRestrictions restrict;


  public Notification subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject of the email notification for the issue. If this is not specified, then the subject is set to the issue key and summary.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  public Notification textBody(String textBody) {
    
    this.textBody = textBody;
    return this;
  }

   /**
   * The plain text body of the email notification for the issue.
   * @return textBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The plain text body of the email notification for the issue.")

  public String getTextBody() {
    return textBody;
  }


  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }


  public Notification htmlBody(String htmlBody) {
    
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * The HTML body of the email notification for the issue.
   * @return htmlBody
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTML body of the email notification for the issue.")

  public String getHtmlBody() {
    return htmlBody;
  }


  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }


  public Notification to(NotificationRecipients to) {
    
    this.to = to;
    return this;
  }

   /**
   * The recipients of the email notification for the issue.
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The recipients of the email notification for the issue.")

  public NotificationRecipients getTo() {
    return to;
  }


  public void setTo(NotificationRecipients to) {
    this.to = to;
  }


  public Notification restrict(NotificationRecipientsRestrictions restrict) {
    
    this.restrict = restrict;
    return this;
  }

   /**
   * Restricts the notifications to users with the specified permissions.
   * @return restrict
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restricts the notifications to users with the specified permissions.")

  public NotificationRecipientsRestrictions getRestrict() {
    return restrict;
  }


  public void setRestrict(NotificationRecipientsRestrictions restrict) {
    this.restrict = restrict;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Notification notification = (Notification) o;
    return Objects.equals(this.subject, notification.subject) &&
        Objects.equals(this.textBody, notification.textBody) &&
        Objects.equals(this.htmlBody, notification.htmlBody) &&
        Objects.equals(this.to, notification.to) &&
        Objects.equals(this.restrict, notification.restrict) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subject, textBody, htmlBody, to, restrict, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Notification {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    restrict: ").append(toIndentedString(restrict)).append("\n");
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

