import NavBar from "components/NavBar";
import DonutChart from "components/DonutChart";
import Footer from "components/NavBar/Footer";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";

function App() {
  return (

    // A função só pode ter um retorno, mas com a tag '<> </> pode-se adicionar outros'

    // O BootsTrap dividi o Layout dele em 12 Áreas na horizontal, usar => "col-sm-6" = usar metade linha 

    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard Of Sales</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa De Sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas Vendas</h5>
            <DonutChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary"> All Sales</h2>
        </div>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
