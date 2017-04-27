package olafurpg.scalafix_template.scalafix

import scalafix.testkit._
class Scalafix_template_1_0Test extends SemanticRewriteSuite() {
  val testDir = "scalafix-rewrites/src/test/resources"
  DiffTest.fromFile(new java.io.File(testDir)).foreach(runDiffTest)
}
