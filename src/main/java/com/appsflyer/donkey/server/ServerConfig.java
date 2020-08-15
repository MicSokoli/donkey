package com.appsflyer.donkey.server;

import com.appsflyer.donkey.route.handler.HandlerConfig;
import com.appsflyer.donkey.route.handler.HandlerFactory;
import io.vertx.core.VertxOptions;
import io.vertx.core.http.HttpServerOptions;

import java.util.Objects;

//@todo Add handler config description

/**
 * A DTO object used for initializing a {@link Server}.
 * It is comprised of the following building blocks:
 * <br><br>
 * <p>
 * {@link VertxOptions} vertxOptions - Used to configure and control the {@link io.vertx.core.Vertx}
 * instance associated with the server. See the
 * <a href="https://vertx.io/docs/apidocs/io/vertx/core/VertxOptions.html">documentation</a>
 * for the different options.
 * <br><br>
 * <p>
 * {@link HttpServerOptions} serverOptions - Used to configure HTTP related settings of the server.
 * See the
 * <a href="https://vertx.io/docs/apidocs/io/vertx/core/http/HttpServerOptions.html">documentation</a>
 * for the different options.
 * <br><br>
 * <p>
 *
 * <br><br>
 * <p>
 * {@link HandlerFactory} handlerFactory - Used to create handlers for processing requests / responses.
 */
public class ServerConfig
{
  private final VertxOptions vertxOptions;
  private final HttpServerOptions serverOptions;
  private final HandlerConfig handlerConfig;
  
  public ServerConfig(
      VertxOptions vertxOptions,
      HttpServerOptions serverOptions,
      HandlerConfig handlerConfig)
  {
    Objects.requireNonNull(vertxOptions, "Vert.x options is missing");
    Objects.requireNonNull(serverOptions, "Server options is missing");
    Objects.requireNonNull(handlerConfig, "Handler config is missing");
  
    this.vertxOptions = vertxOptions;
    this.serverOptions = serverOptions;
    this.handlerConfig = handlerConfig;
  }
  
  VertxOptions vertxOptions()
  {
    return vertxOptions;
  }
  
  HttpServerOptions serverOptions()
  {
    return serverOptions;
  }
  
  HandlerConfig handlerConfig()
  {
    return handlerConfig;
  }
}
