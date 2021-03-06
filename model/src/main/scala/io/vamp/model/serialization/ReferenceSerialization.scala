package io.vamp.model.serialization

import io.vamp.model.artifact.Reference
import org.json4s.JsonAST.{ JObject, JString }
import org.json4s._

trait ReferenceSerialization {

  def serializeReference(reference: Reference) = new JObject(List(serializeReferenceAsField(reference)))

  def serializeReferenceAsField(reference: Reference) = JField("reference", JString(reference.name))
}
