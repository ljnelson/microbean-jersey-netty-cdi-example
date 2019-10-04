/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2019 Laird Nelson.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package io.github.ljnelson.microbean.jersey.netty.cdi.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.enterprise.context.ApplicationScoped;

import javax.ws.rs.ApplicationPath;

import javax.ws.rs.core.Application;

/**
 * An {@link Application} showing <a href="https://netty.io/"
 * target="_parent">Netty</a>, <a
 * href="https://projects.eclipse.org/projects/ee4j.jersey"
 * target="_parent">Jersey</a> and <a
 * href="https://jakarta.ee/specifications/cdi/2.0/"
 * target="_parent">CDI</a> integration.
 *
 * @author <a href="https://about.me/lairdnelson"
 * target="_parent">Laird Nelson</a>
 *
 * @see <a href="https://microbean.github.io/microbean-jersey-netty/"
 * target="_parent">microBean™ Jersey Netty Integration</a>
 *
 * @see <a
 * href="https://microbean.github.io/microbean-jersey-netty-cdi/"
 * target="_parent">microBean™ Jersey Netty CDI Integration</a>
 *
 * @see <a href="https://microbean.github.io/microbean-jaxrs-cdi/"
 * target="_parent">microBean™ Jakarta RESTful Web Services CDI
 * Integration</a>
 */
@ApplicationPath("")
@ApplicationScoped
public class ExampleApplication extends Application {

  private final Set<Class<?>> resourceClasses;

  /**
   * Creates a new {@link ExampleApplication}.
   */
  public ExampleApplication() {
    super();
    final Set<Class<?>> resourceClasses = new HashSet<>();
    resourceClasses.add(DataResource.class);
    this.resourceClasses = Collections.unmodifiableSet(resourceClasses);
  }

  /**
   * Returns a non-{@code null} {@linkplain
   * Collections#unmodifiableSet(Set) unmodifiable} {@link Set} of
   * root resource classes comprising this {@link ExampleApplication}.
   *
   * <p>This method never returns {@code null}.</p>
   *
   * @return a non-{@code null} {@linkplain
   * Collections#unmodifiableSet(Set) unmodifiable} {@link Set} of
   * root resource classes comprising this {@link ExampleApplication}
   */
  @Override
  public Set<Class<?>> getClasses() {
    return this.resourceClasses;
  }
  
}
