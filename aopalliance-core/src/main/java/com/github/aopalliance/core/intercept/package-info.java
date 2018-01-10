/**
 * 拦截包: 本包提供(中途)拦截机制相关的一系列接口.
 *
 * (中途)拦截是实现AOP的基本机制.
 * 这种机制广泛地被应用于中间件和现代应用服务器,包括J2EE领域.
 *
 *
 *
 This package provides an {@link org.aopalliance.intercept.Interceptor} interface that will intercept different runtime joinpoints (e.g. method calls, field access, ...). Thus, interceptors are able to add some behavior around the joinpoints actual executions. Several interceptors can be applied on a given joinpoint since they are chained. The AO system implementor should provide means to install and order these chains of interceptors.
 */
package com.github.aopalliance.core.intercept;