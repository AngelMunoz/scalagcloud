package com.github.angelmunoz.scalagcloud
import com.google.cloud.functions.{HttpRequest, HttpResponse, HttpFunction}

class GloudFn extends HttpFunction {
  override def service(
      httpRequest: HttpRequest,
      httpResponse: HttpResponse
  ): Unit = {
    httpResponse.getWriter.write("Hello World!")
  }
}
