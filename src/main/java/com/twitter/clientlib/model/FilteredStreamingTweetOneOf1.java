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
import com.twitter.clientlib.model.Problem;
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
 * FilteredStreamingTweetOneOf1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FilteredStreamingTweetOneOf1 {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<Problem> errors = new ArrayList<>();

  public FilteredStreamingTweetOneOf1() { 
  }

  public FilteredStreamingTweetOneOf1 errors(List<Problem> errors) {
    
    this.errors = errors;
    return this;
  }

  public FilteredStreamingTweetOneOf1 addErrorsItem(Problem errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<Problem> getErrors() {
    return errors;
  }


  public void setErrors(List<Problem> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilteredStreamingTweetOneOf1 filteredStreamingTweetOneOf1 = (FilteredStreamingTweetOneOf1) o;
    return Objects.equals(this.errors, filteredStreamingTweetOneOf1.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilteredStreamingTweetOneOf1 {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errors");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FilteredStreamingTweetOneOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
     // if (jsonObj == null) {
     //   if (FilteredStreamingTweetOneOf1.openapiRequiredFields.isEmpty()) {
     //     return;
     //   } else { // has required fields
     //     throw new IllegalArgumentException(String.format("The required field(s) %s in FilteredStreamingTweetOneOf1 is not found in the empty JSON string", FilteredStreamingTweetOneOf1.openapiRequiredFields.toString()));
     //   }
     // }


      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FilteredStreamingTweetOneOf1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      JsonArray jsonArrayerrors = jsonObj.getAsJsonArray("errors");
      if (jsonArrayerrors != null) {
        // ensure the json data is an array
        if (!jsonObj.get("errors").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
        }

        // validate the optional field `errors` (array)
        for (int i = 0; i < jsonArrayerrors.size(); i++) {
          Problem.validateJsonObject(jsonArrayerrors.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilteredStreamingTweetOneOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilteredStreamingTweetOneOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilteredStreamingTweetOneOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilteredStreamingTweetOneOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<FilteredStreamingTweetOneOf1>() {
           @Override
           public void write(JsonWriter out, FilteredStreamingTweetOneOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilteredStreamingTweetOneOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilteredStreamingTweetOneOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilteredStreamingTweetOneOf1
  * @throws IOException if the JSON string is invalid with respect to FilteredStreamingTweetOneOf1
  */
  public static FilteredStreamingTweetOneOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilteredStreamingTweetOneOf1.class);
  }

 /**
  * Convert an instance of FilteredStreamingTweetOneOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

