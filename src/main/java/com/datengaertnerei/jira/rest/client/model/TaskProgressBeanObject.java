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
import java.net.URI;

/**
 * Details about a task.
 */
@ApiModel(description = "Details about a task.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-17T17:45:56.601554Z[Etc/UTC]")
public class TaskProgressBeanObject {
  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * The status of the task.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    ENQUEUED("ENQUEUED"),
    
    RUNNING("RUNNING"),
    
    COMPLETE("COMPLETE"),
    
    FAILED("FAILED"),
    
    CANCEL_REQUESTED("CANCEL_REQUESTED"),
    
    CANCELLED("CANCELLED"),
    
    DEAD("DEAD");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_RESULT = "result";
  @SerializedName(SERIALIZED_NAME_RESULT)
  private Object result = null;

  public static final String SERIALIZED_NAME_SUBMITTED_BY = "submittedBy";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY)
  private Long submittedBy;

  public static final String SERIALIZED_NAME_PROGRESS = "progress";
  @SerializedName(SERIALIZED_NAME_PROGRESS)
  private Long progress;

  public static final String SERIALIZED_NAME_ELAPSED_RUNTIME = "elapsedRuntime";
  @SerializedName(SERIALIZED_NAME_ELAPSED_RUNTIME)
  private Long elapsedRuntime;

  public static final String SERIALIZED_NAME_SUBMITTED = "submitted";
  @SerializedName(SERIALIZED_NAME_SUBMITTED)
  private Long submitted;

  public static final String SERIALIZED_NAME_STARTED = "started";
  @SerializedName(SERIALIZED_NAME_STARTED)
  private Long started;

  public static final String SERIALIZED_NAME_FINISHED = "finished";
  @SerializedName(SERIALIZED_NAME_FINISHED)
  private Long finished;

  public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
  private Long lastUpdate;


  public TaskProgressBeanObject self(URI self) {
    
    this.self = self;
    return this;
  }

   /**
   * The URL of the task.
   * @return self
  **/
  @ApiModelProperty(required = true, value = "The URL of the task.")

  public URI getSelf() {
    return self;
  }


  public void setSelf(URI self) {
    this.self = self;
  }


  public TaskProgressBeanObject id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the task.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The ID of the task.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TaskProgressBeanObject description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the task.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the task.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TaskProgressBeanObject status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the task.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the task.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TaskProgressBeanObject message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Information about the progress of the task.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Information about the progress of the task.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public TaskProgressBeanObject result(Object result) {
    
    this.result = result;
    return this;
  }

   /**
   * The result of the task execution.
   * @return result
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The result of the task execution.")

  public Object getResult() {
    return result;
  }


  public void setResult(Object result) {
    this.result = result;
  }


  public TaskProgressBeanObject submittedBy(Long submittedBy) {
    
    this.submittedBy = submittedBy;
    return this;
  }

   /**
   * The ID of the user who submitted the task.
   * @return submittedBy
  **/
  @ApiModelProperty(required = true, value = "The ID of the user who submitted the task.")

  public Long getSubmittedBy() {
    return submittedBy;
  }


  public void setSubmittedBy(Long submittedBy) {
    this.submittedBy = submittedBy;
  }


  public TaskProgressBeanObject progress(Long progress) {
    
    this.progress = progress;
    return this;
  }

   /**
   * The progress of the task, as a percentage complete.
   * @return progress
  **/
  @ApiModelProperty(required = true, value = "The progress of the task, as a percentage complete.")

  public Long getProgress() {
    return progress;
  }


  public void setProgress(Long progress) {
    this.progress = progress;
  }


  public TaskProgressBeanObject elapsedRuntime(Long elapsedRuntime) {
    
    this.elapsedRuntime = elapsedRuntime;
    return this;
  }

   /**
   * The execution time of the task, in milliseconds.
   * @return elapsedRuntime
  **/
  @ApiModelProperty(required = true, value = "The execution time of the task, in milliseconds.")

  public Long getElapsedRuntime() {
    return elapsedRuntime;
  }


  public void setElapsedRuntime(Long elapsedRuntime) {
    this.elapsedRuntime = elapsedRuntime;
  }


  public TaskProgressBeanObject submitted(Long submitted) {
    
    this.submitted = submitted;
    return this;
  }

   /**
   * A timestamp recording when the task was submitted.
   * @return submitted
  **/
  @ApiModelProperty(required = true, value = "A timestamp recording when the task was submitted.")

  public Long getSubmitted() {
    return submitted;
  }


  public void setSubmitted(Long submitted) {
    this.submitted = submitted;
  }


  public TaskProgressBeanObject started(Long started) {
    
    this.started = started;
    return this;
  }

   /**
   * A timestamp recording when the task was started.
   * @return started
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp recording when the task was started.")

  public Long getStarted() {
    return started;
  }


  public void setStarted(Long started) {
    this.started = started;
  }


  public TaskProgressBeanObject finished(Long finished) {
    
    this.finished = finished;
    return this;
  }

   /**
   * A timestamp recording when the task was finished.
   * @return finished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A timestamp recording when the task was finished.")

  public Long getFinished() {
    return finished;
  }


  public void setFinished(Long finished) {
    this.finished = finished;
  }


  public TaskProgressBeanObject lastUpdate(Long lastUpdate) {
    
    this.lastUpdate = lastUpdate;
    return this;
  }

   /**
   * A timestamp recording when the task progress was last updated.
   * @return lastUpdate
  **/
  @ApiModelProperty(required = true, value = "A timestamp recording when the task progress was last updated.")

  public Long getLastUpdate() {
    return lastUpdate;
  }


  public void setLastUpdate(Long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskProgressBeanObject taskProgressBeanObject = (TaskProgressBeanObject) o;
    return Objects.equals(this.self, taskProgressBeanObject.self) &&
        Objects.equals(this.id, taskProgressBeanObject.id) &&
        Objects.equals(this.description, taskProgressBeanObject.description) &&
        Objects.equals(this.status, taskProgressBeanObject.status) &&
        Objects.equals(this.message, taskProgressBeanObject.message) &&
        Objects.equals(this.result, taskProgressBeanObject.result) &&
        Objects.equals(this.submittedBy, taskProgressBeanObject.submittedBy) &&
        Objects.equals(this.progress, taskProgressBeanObject.progress) &&
        Objects.equals(this.elapsedRuntime, taskProgressBeanObject.elapsedRuntime) &&
        Objects.equals(this.submitted, taskProgressBeanObject.submitted) &&
        Objects.equals(this.started, taskProgressBeanObject.started) &&
        Objects.equals(this.finished, taskProgressBeanObject.finished) &&
        Objects.equals(this.lastUpdate, taskProgressBeanObject.lastUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, id, description, status, message, result, submittedBy, progress, elapsedRuntime, submitted, started, finished, lastUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskProgressBeanObject {\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    elapsedRuntime: ").append(toIndentedString(elapsedRuntime)).append("\n");
    sb.append("    submitted: ").append(toIndentedString(submitted)).append("\n");
    sb.append("    started: ").append(toIndentedString(started)).append("\n");
    sb.append("    finished: ").append(toIndentedString(finished)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
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

