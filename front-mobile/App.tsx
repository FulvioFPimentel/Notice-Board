import { StatusBar } from 'expo-status-bar';
import "react-native-screens";
import { NavigationContainer } from '@react-navigation/native'
import Routes from './src/routes';


const App: React.FC = () => {
  return (
    <NavigationContainer>
      <Routes/>
    </NavigationContainer>
  );
}

export default App;