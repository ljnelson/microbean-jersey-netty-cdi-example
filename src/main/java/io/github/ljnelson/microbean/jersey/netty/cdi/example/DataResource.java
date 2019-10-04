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

import javax.enterprise.context.ApplicationScoped;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * A root resource class.
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
@ApplicationScoped
@Path("example")
public class DataResource {

  /**
   * Creates a new {@link DataResource}.
   */
  public DataResource() {
    super();
  }

  /**
   * Returns a {@link String} representing example data.
   *
   * <p>This method never returns {@code null}.</p>
   *
   * @return a non-{@code null} {@link String} representing example
   * data
   */
  @GET
  @Path("data")
  @Produces("text/plain")
  public String getData() {
    return "Here is the data";
  }
  
}
