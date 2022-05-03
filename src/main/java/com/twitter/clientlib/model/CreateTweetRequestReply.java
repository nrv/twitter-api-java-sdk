/*
Copyright 2020 Twitter, Inc.
SPDX-License-Identifier: Apache-2.0

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
https://openapi-generator.tech
Do not edit the class manually.
*/


package com.twitter.clientlib.model;

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
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.twitter.clientlib.JSON;

/**
 * Tweet information of the Tweet being replied to.
 */
@ApiModel(description = "Tweet information of the Tweet being replied to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateTweetRequestReply {
  public static final String SERIALIZED_NAME_IN_REPLY_TO_TWEET_ID = "in_reply_to_tweet_id";
  @SerializedName(SERIALIZED_NAME_IN_REPLY_TO_TWEET_ID)
  private String inReplyToTweetId;

  public static final String SERIALIZED_NAME_EXCLUDE_REPLY_USER_IDS = "exclude_reply_user_ids";
  @SerializedName(SERIALIZED_NAME_EXCLUDE_REPLY_USER_IDS)
  private List<String> excludeReplyUserIds = null;

  public CreateTweetRequestReply() { 
  }

  public CreateTweetRequestReply inReplyToTweetId(String inReplyToTweetId) {
    
    this.inReplyToTweetId = inReplyToTweetId;
    return this;
  }

   /**
   * Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
   * @return inReplyToTweetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1346889436626259968", value = "Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.")

  public String getInReplyToTweetId() {
    return inReplyToTweetId;
  }


  public void setInReplyToTweetId(String inReplyToTweetId) {
    this.inReplyToTweetId = inReplyToTweetId;
  }


  public CreateTweetRequestReply excludeReplyUserIds(List<String> excludeReplyUserIds) {
    
    this.excludeReplyUserIds = excludeReplyUserIds;
    return this;
  }

  public CreateTweetRequestReply addExcludeReplyUserIdsItem(String excludeReplyUserIdsItem) {
    if (this.excludeReplyUserIds == null) {
      this.excludeReplyUserIds = new ArrayList<>();
    }
    this.excludeReplyUserIds.add(excludeReplyUserIdsItem);
    return this;
  }

   /**
   * A list of User Ids to be excluded from the reply Tweet.
   * @return excludeReplyUserIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of User Ids to be excluded from the reply Tweet.")

  public List<String> getExcludeReplyUserIds() {
    return excludeReplyUserIds;
  }


  public void setExcludeReplyUserIds(List<String> excludeReplyUserIds) {
    this.excludeReplyUserIds = excludeReplyUserIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTweetRequestReply createTweetRequestReply = (CreateTweetRequestReply) o;
    return Objects.equals(this.inReplyToTweetId, createTweetRequestReply.inReplyToTweetId) &&
        Objects.equals(this.excludeReplyUserIds, createTweetRequestReply.excludeReplyUserIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inReplyToTweetId, excludeReplyUserIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTweetRequestReply {\n");
    sb.append("    inReplyToTweetId: ").append(toIndentedString(inReplyToTweetId)).append("\n");
    sb.append("    excludeReplyUserIds: ").append(toIndentedString(excludeReplyUserIds)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("in_reply_to_tweet_id");
    openapiFields.add("exclude_reply_user_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateTweetRequestReply
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (CreateTweetRequestReply.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in CreateTweetRequestReply is not found in the empty JSON string", CreateTweetRequestReply.openapiRequiredFields.toString()));
     //   }
     // }

      if (jsonObj.get("in_reply_to_tweet_id") != null && !jsonObj.get("in_reply_to_tweet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in_reply_to_tweet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in_reply_to_tweet_id").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("exclude_reply_user_ids") != null && !jsonObj.get("exclude_reply_user_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `exclude_reply_user_ids` to be an array in the JSON string but got `%s`", jsonObj.get("exclude_reply_user_ids").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateTweetRequestReply.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateTweetRequestReply' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateTweetRequestReply> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateTweetRequestReply.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateTweetRequestReply>() {
           @Override
           public void write(JsonWriter out, CreateTweetRequestReply value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateTweetRequestReply read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateTweetRequestReply given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateTweetRequestReply
  * @throws IOException if the JSON string is invalid with respect to CreateTweetRequestReply
  */
  public static CreateTweetRequestReply fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateTweetRequestReply.class);
  }

 /**
  * Convert an instance of CreateTweetRequestReply to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

