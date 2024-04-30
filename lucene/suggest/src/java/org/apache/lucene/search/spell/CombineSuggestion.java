/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.search.spell;

/**
 * A suggestion generated by combining one or more original query terms
 *
 * @param originalTermIndexes The indexes from the passed-in array of terms used to make this word
 *     combination
 * @param suggestion The word combination suggestion
 */
public record CombineSuggestion(SuggestWord suggestion, int[] originalTermIndexes) {
  /**
   * Creates a new CombineSuggestion from a <code>suggestion</code> and an array of term ids
   * (referencing the indexes to the original terms that form this combined suggestion)
   */
  public CombineSuggestion {}
}
