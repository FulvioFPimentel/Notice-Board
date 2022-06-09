import react from 'react';
import { useNavigation } from '@react-navigation/native'
import { View, Text, TouchableOpacity } from 'react-native';
import { StackNavigationProp } from '@react-navigation/stack';


type navigateParam = {
    Notice: undefined;
}

type StackProp = StackNavigationProp<navigateParam>;

const Home: React.FC = () => {

    const navigation = useNavigation<StackProp>();
    return (
        <View>
            <Text>Bem vindo a o Notice Board</Text>
            <TouchableOpacity style={{
                backgroundColor: "#621",
                padding: 10,
                borderRadius:5,
                width: 285,
                alignItems: 'center',
                justifyContent: 'center',
            }}
            onPress={() => navigation.navigate('Notice')}
            >
                <Text style={{ color:"#fff"}}>Clique aqui</Text>
            </TouchableOpacity>
        </View>
    );
}

export default Home;