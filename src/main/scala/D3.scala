import scalajs.js.`|`
import scalajs.js
import scala.scalajs.js.annotation._
import org.scalajs.dom

package d3v4 {
  object d3

  @js.native
  trait BaseEvent extends js.Object {
    var `type`: String = js.native
    var sourceEvent: dom.Event = js.native
  }
}

package object d3v4 {
  // type Primitive = Double | String | Boolean
  //
  // type DatumThisFunction3[Return] = js.ThisFunction3[CurrentDom, Datum, Index, Group, Return]
  // type DatumThisFunction2[Return] = js.ThisFunction2[CurrentDom, Datum, Index, Return]
  // type DatumThisFunction1[Return] = js.ThisFunction1[CurrentDom, Datum, Return]
  // type DatumThisFunction0[Return] = js.ThisFunction0[CurrentDom, Return]

  type CurrentDom = dom.EventTarget
  type Index = Int
  type Group = js.UndefOr[Int]

  type ValueFunction0[Return] = js.Function0[Return]
  type ValueFunction1[Datum, Return] = js.Function1[Datum, Return]
  type ValueFunction2[Datum, Return] = js.Function2[Datum, Index, Return]
  type ValueFunction3[Datum, Return] = js.Function3[Datum, Index, Group, Return]

  type ValueThisFunction0[C <: CurrentDom, Return] = js.ThisFunction0[C, Return]
  type ValueThisFunction1[C <: CurrentDom, Datum, Return] = js.ThisFunction1[C, Datum, Return]
  type ValueThisFunction2[C <: CurrentDom, Datum, Return] = js.ThisFunction2[C, Datum, Index, Return]
  type ValueThisFunction3[C <: CurrentDom, Datum, Return] = js.ThisFunction3[C, Datum, Index, Group, Return]

  type ListenerFunction0 = ValueFunction0[Unit]
  type ListenerFunction1[Datum] = ValueFunction1[Datum, Unit]
  type ListenerFunction2[Datum] = ValueFunction2[Datum, Unit]
  type ListenerFunction3[Datum] = ValueFunction3[Datum, Unit]

  type ListenerThisFunction0[C <: CurrentDom] = ValueThisFunction0[C, Unit]
  type ListenerThisFunction1[C <: CurrentDom, Datum] = ValueThisFunction1[C, Datum, Unit]
  type ListenerThisFunction2[C <: CurrentDom, Datum] = ValueThisFunction2[C, Datum, Unit]
  type ListenerThisFunction3[C <: CurrentDom, Datum] = ValueThisFunction3[C, Datum, Unit]

  implicit def d3toD3Axis(d3t: d3.type): d3axis.type = d3axis
  implicit def d3toD3Color(d3t: d3.type): d3color.type = d3color
  implicit def d3toD3Drag(d3t: d3.type): d3drag.type = d3drag
  implicit def d3toD3Force(d3t: d3.type): d3force.type = d3force
  implicit def d3toD3Polygon(d3t: d3.type): d3polygon.type = d3polygon
  implicit def d3toD3Scale(d3t: d3.type): d3scale.type = d3scale
  implicit def d3toD3Selection(d3t: d3.type): d3selection.type = d3selection
  implicit def d3toD3Shape(d3t: d3.type): d3shape.type = d3shape
  implicit def d3toD3Time(d3t: d3.type): d3time.type = d3time
  implicit def d3toD3Quadtree(d3t: d3.type): d3quadtree.type = d3quadtree
  implicit def d3toD3Zoom(d3t: d3.type): d3zoom.type = d3zoom

  implicit class SelectionExtensions[Datum](val s: Selection[Datum]) extends AnyVal {
    def nodeAs[T <: dom.EventTarget] = s.node().asInstanceOf[T]
  }

  implicit class SimulationExtensions[N <: SimulationNode](val s: Simulation[N]) extends AnyVal {
    def forceAs[F <: Force[N]](name: String) = s.force(name).asInstanceOf[F]
  }

  implicit def baseEventToZoomEvent(e:BaseEvent):ZoomEvent = e.asInstanceOf[ZoomEvent]
  implicit def baseEventToDragEvent(e:BaseEvent):DragEvent = e.asInstanceOf[DragEvent]
}
