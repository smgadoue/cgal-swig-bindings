import CGAL.Kernel.Point_3;
import CGAL.Kernel.Plane_3;
import CGAL.Polyhedron_3.Polyhedron;
import CGAL.Polyhedron_3.Polyhedron_3_Halfedge_handle;
import CGAL.Polyhedron_3.Polyhedron_3_Vertex_handle;
import CGAL.Polyhedron_3.Polyhedron_3_Facet_handle;
  
public class test_polyhedron {
  public static void main(String arg[]){
    System.loadLibrary("Kernel");
    System.loadLibrary("Polyhedron_3");

    Polyhedron p=new Polyhedron();
    p.make_triangle();
      
    System.out.println(p.size_of_vertices());
    
    int h=0;
    for (Polyhedron_3_Halfedge_handle hh : p.halfedges())
      ++h;
    int v=0;
    for (Polyhedron_3_Vertex_handle hh : p.vertices())
      ++v;
    int f=0;
    for (Polyhedron_3_Facet_handle hh : p.facets())
      ++f;
    int e=0;
    for (Polyhedron_3_Halfedge_handle hh : p.edges())
      ++e;   

    int pt=0;
    for (Point_3 hh : p.points())
      ++pt;  

    int pl=0;
    for (Plane_3 hh : p.planes())
      ++pl; 
    
    System.out.println(v);
    System.out.println(f);
    System.out.println(h);
    System.out.println(e);
    System.out.println(pt);
    System.out.println(pl);
  }
};
