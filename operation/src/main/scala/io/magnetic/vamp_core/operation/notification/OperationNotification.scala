package io.magnetic.vamp_core.operation.notification

import io.magnetic.vamp_common.akka.RequestError
import io.magnetic.vamp_common.notification.Notification


case class UnsupportedDeploymentRequest(request: Any) extends Notification with RequestError


