/*
 * Copyright 2020 AppsFlyer
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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
 *
 */

package com.appsflyer.donkey.server.handler;

import io.vertx.core.Handler;
import io.vertx.ext.web.RoutingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class InternalServerErrorHandler implements Handler<RoutingContext> {
  
  private static final Logger logger = LoggerFactory.getLogger(
      InternalServerErrorHandler.class.getName());
  
  public static InternalServerErrorHandler create() {
    return new InternalServerErrorHandler();
  }
  
  private InternalServerErrorHandler() {}
  
  @Override
  public void handle(RoutingContext ctx) {
    logger.error("Internal Server Error:", ctx.failure());
    ctx.response().setStatusCode(500).end();
  }
}
