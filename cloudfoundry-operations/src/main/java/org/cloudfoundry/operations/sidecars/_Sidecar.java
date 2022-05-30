/*
 * Copyright 2013-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.operations.sidecars;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.cloudfoundry.client.v3.ToOneRelationship;
import org.immutables.value.Value;

import java.time.ZonedDateTime;
import java.util.List;

@Value.Immutable
abstract class _Sidecar {
    /**
     * Unique identifier for the sidecar
     */
    abstract String getGuid();

    /**
     * Human-readable name for the sidecar
     */
    abstract String getName();

    /**
     * The command used to start the sidecar
     */
    abstract String getCommand();

    /**
     * A list of process types the sidecar applies to
     */
    abstract List<String> getProcessTypes();

    /**
     * Reserved memory for sidecar
     */
    @JsonProperty("memory_in_mb")
    abstract Integer getMemoryInMb();

    /**
     * Specifies whether the sidecar was created by the user or via the buildpack
     */
    abstract String getOrigin();

    /**
     * The app the sidecar is associated with
     */
    @JsonProperty("relationships")
    abstract ToOneRelationship getRelationships();

    /**
     * The time with zone when the object was created
     */
    @JsonProperty("created_at")
    abstract ZonedDateTime getCreatedAt();

    /**
     * The time with zone when the object was last updated
     */
    @JsonProperty("updated_at")
    abstract ZonedDateTime getUpdatedAt();
}
