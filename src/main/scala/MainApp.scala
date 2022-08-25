import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.{document, window}

import java.util.UUID

object MainApp extends JSApp {

  def randonId = UUID.randomUUID()
  def main(): Unit = {
    println("Starting 'uuidgen'...")

    val p = document.createElement("p")
    val text = document.createTextNode(s"id=$randonId")
    p.appendChild(text)
    document.body.appendChild(p)
  }

}
