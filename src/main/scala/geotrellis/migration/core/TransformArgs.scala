package geotrellis.migration.core

case class TransformArgs(
  typeName: String,
  tileType: String = "singleband", // only for hadoop && file
  xResolution: Int = 0,
  yResolution: Int = 0,
  format: String = "",
  temporalResolution: Option[Long] = None
)
