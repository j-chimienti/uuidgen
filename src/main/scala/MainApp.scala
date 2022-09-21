import org.scalajs.dom
import org.scalajs.dom.document

import java.util.UUID

object MainApp {

  def randomId: UUID = UUID.randomUUID()
  def main(args: Array[String]): Unit = {

    val uuid = document.getElementById("uuid")
    uuid.textContent = randomId.toString
    val button = document.getElementById("generate_btn")

    button.addEventListener("click", { (e: dom.MouseEvent) =>
      uuid.textContent = randomId.toString
    })

  }

}
