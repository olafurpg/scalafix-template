package olafurpg.scalafix_template.scalafix

import scalafix._
import scala.meta._

import org.scalameta.logger
case object Scalafix_template_1_0 extends Rewrite {
  override def rewrite(ctx: RewriteCtx): Patch = {
    println("!!!!!!!!!")
    q"def x = 2" match {
      case q"def $name = 2" => name
    }
    val q"$name" = Term.Name("x")
    logger.elem(ctx.tree)
    Patch.empty
  }
}
